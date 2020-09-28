package org.nrg.xnat.turbine.modules.actions;

import org.apache.log4j.Logger;
import org.apache.turbine.util.RunData;
import org.apache.velocity.context.Context;
import org.nrg.xdat.XDAT;
import org.nrg.xdat.om.XnatProjectdata;
import org.nrg.xdat.turbine.modules.actions.SecureAction;
import org.nrg.xdat.turbine.utils.TurbineUtils;
import org.nrg.xft.security.UserI;
import org.nrg.xnat.biomedia.userAttributes.entities.UserAttributes;
import org.nrg.xnat.biomedia.userAttributes.services.UserAttributesService;

/**
 * Created by gmlenz on 24/11/16.
 */
public class SignTermsAction extends SecureAction {
    static Logger logger = Logger.getLogger(SignTermsAction.class);

    @Override
    public void doPerform(RunData data, Context context) throws Exception {
        UserI user = TurbineUtils.getUser(data);

        logger.info(user.getFirstname() + " is logged in and just signed the Terms of Use");

        UserAttributesService signService = XDAT.getContextService().getBean(UserAttributesService.class);
        UserAttributes userAttribute = signService.findByUserName(user.getUsername());
        userAttribute.setAgreedTerms(true);
        signService.updateUserAttributes(userAttribute);

        String name = TurbineUtils.GetPassedParameter("project", data).toString();
        final XnatProjectdata prID = XnatProjectdata.getProjectByIDorAlias(name, user, false);

        context.put("user", XDAT.getUserDetails());
        context.put("server", TurbineUtils.GetFullServerPath());
        context.put("process", "Transfer to the archive.");
        context.put("system", TurbineUtils.GetSystemName());
        context.put("access_level", "member");
        context.put("admin_email", XDAT.getSiteConfigPreferences().getAdminEmail());
        context.put("projectOM", prID);

        try {
            org.nrg.xnat.turbine.modules.actions.ProcessAccessRequest.SendAccessApprovalEmail(context, user.getEmail(), TurbineUtils.getUser(data), "Access Granted for dHCP");
        } catch (Exception e) {
            logger.error(e.getStackTrace());
        }

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
