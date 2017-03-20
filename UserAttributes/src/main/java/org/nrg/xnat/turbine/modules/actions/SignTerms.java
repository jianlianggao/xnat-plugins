package org.nrg.xnat.turbine.modules.actions;

import org.apache.log4j.Logger;
import org.apache.turbine.util.RunData;
import org.apache.velocity.context.Context;
import org.nrg.xdat.XDAT;
import org.nrg.xdat.entities.XdatUserAuth;
import org.nrg.xdat.security.UserGroupI;
import org.nrg.xdat.security.helpers.Groups;
import org.nrg.xdat.services.XdatUserAuthService;
import org.nrg.xdat.turbine.modules.actions.SecureAction;
import org.nrg.xdat.turbine.utils.TurbineUtils;
import org.nrg.xft.security.UserI;
import org.nrg.xnat.biomedia.userAttributes.entities.UserAttributes;
import org.nrg.xnat.biomedia.userAttributes.services.UserAttributesService;

import java.util.List;

/**
 * Created by gmlenz on 24/11/16.
 */
public class SignTerms extends SecureAction {
    static Logger logger = Logger.getLogger(SignTerms.class);

    @Override
    public void doPerform(RunData data, Context context) throws Exception {

        logger.info("SignTerms.java / doPerfom");

        UserI user = TurbineUtils.getUser(data);

        logger.info(user.getFirstname() + "is logged in and just signed the Terms of Use");

        UserAttributesService signService = XDAT.getContextService().getBean(UserAttributesService.class);
        UserAttributes userAttribute = signService.findByUserName(user.getUsername());
        userAttribute.setAgreedTerms(true);
        signService.updateUserAttributes(userAttribute);

        /*String p = ((String)org.nrg.xdat.turbine.utils.TurbineUtils.GetPassedParameter("project",data));
        List<UserGroupI> groups = Groups.getAllGroups();
        Groups.getUserGroupService().getGroup(p);
        //Groups.addUserToGroup(Groups.getGroupByTagAndName(p, p))
        Groups.removeUserFromGroup(user, user, "DataRel1Pub_collaborator", );
*/
        data.setMessage("Preferences updated");
        data.setScreenTemplate("Index.vm");

    }
}
