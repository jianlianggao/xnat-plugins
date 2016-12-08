package org.nrg.xnat.turbine.modules.actions;

import org.apache.log4j.Logger;
import org.apache.turbine.util.RunData;
import org.apache.velocity.context.Context;
import org.nrg.xdat.XDAT;
import org.nrg.xdat.entities.XdatUserAuth;
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

        logger.info(user.getFirstname() + "is logged in and about to sign the Terms of Use");

        XdatUserAuthService service1 = XDAT.getContextService().getBean(XdatUserAuthService.class);
        UserAttributesService service2 = XDAT.getContextService().getBean(UserAttributesService.class);

        XdatUserAuth obj1 = new XdatUserAuth("Hans", "localdb");
        UserAttributes obj2 = new UserAttributes("Hans", true);

        service1.create(obj1);
        List<XdatUserAuth> result = service1.getUsersByName("Hans");

        service2.create(obj2);
        //testservice.attachUserAttributes("Hans", false);

        data.setMessage("It works.");

        data.setScreenTemplate("Index.vm");
    }
}
