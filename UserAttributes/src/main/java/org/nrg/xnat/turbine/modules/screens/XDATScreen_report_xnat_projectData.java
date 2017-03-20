/*
 * web: org.nrg.xnat.turbine.modules.screens.XDATScreen_report_xnat_projectData
 * XNAT http://www.xnat.org
 * Copyright (c) 2016, Washington University School of Medicine and Howard Hughes Medical Institute
 * All Rights Reserved
 *
 * Released under the Simplified BSD.
 */

package org.nrg.xnat.turbine.modules.screens;

import org.apache.turbine.util.RunData;
import org.apache.velocity.context.Context;
import org.nrg.xdat.XDAT;
import org.nrg.xdat.exceptions.IllegalAccessException;
import org.nrg.xdat.om.XnatProjectdata;
import org.nrg.xdat.security.helpers.Permissions;
import org.nrg.xdat.turbine.modules.screens.SecureReport;
import org.nrg.xdat.turbine.utils.TurbineUtils;
import org.nrg.xft.db.ItemAccessHistory;
import org.nrg.xft.db.PoolDBUtils;
import org.nrg.xft.exception.DBPoolException;
import org.nrg.xft.exception.ElementNotFoundException;
import org.nrg.xft.exception.XFTInitException;
import org.nrg.xft.security.UserI;
import org.nrg.xnat.biomedia.userAttributes.entities.UserAttributes;
import org.nrg.xnat.biomedia.userAttributes.services.UserAttributesService;
import org.nrg.xnat.turbine.utils.ProjectAccessRequest;

import java.sql.SQLException;

/**
 * @author XDAT
 */
public class XDATScreen_report_xnat_projectData extends SecureReport {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XDATScreen_report_xnat_projectData.class);
	/* (non-Javadoc)
	 * @see org.nrg.xdat.turbine.modules.screens.SecureReport#finalProcessing(org.apache.turbine.util.RunData, org.apache.velocity.context.Context)
	 */
	public void finalProcessing(RunData data, Context context) {
        XnatProjectdata project = (XnatProjectdata)om;

        try {
            UserI user = TurbineUtils.getUser(data);
            UserAttributesService userService = XDAT.getContextService().getBean(UserAttributesService.class);

            String username = user.getUsername();

            UserAttributes extendedUser = userService.findByUserName(username);

            if (extendedUser == null) {
                extendedUser = userService.create(new UserAttributes(username));
            }

            if(extendedUser.hasAcceptedTerms()){
                context.put("hasAcceptedUserTerms", true);
            }
            else
                context.put("hasAcceptedUserTerms", false);

        	if(Permissions.canRead(user,"xnat:subjectData/project",project.getId()))
        		ItemAccessHistory.LogAccess(user, item, "report");


           if(ProjectAccessRequest.CREATED_PAR_TABLE){
               Integer parcount=(Integer)PoolDBUtils.ReturnStatisticQuery("SELECT COUNT(par_id)::int4 AS count FROM xs_par_table WHERE proj_id='"+ project.getId() + "'", "count", user.getDBName(), user.getLogin());
               context.put("par_count", parcount);
           }

           if(((String) TurbineUtils.GetPassedParameter("topTab",data))!=null){
        	   context.put("topTab", ((String) TurbineUtils.GetPassedParameter("topTab",data)));
           }

           if(((String) TurbineUtils.GetPassedParameter("bottomTab",data))!=null){
        	   context.put("bottomTab", ((String) TurbineUtils.GetPassedParameter("bottomTab",data)));
           }

            setDefaultTabs("xnat_projectData_summary_details", "xnat_projectData_summary_management", "xnat_projectData_summary_manage", "xnat_projectData_summary_pipeline", "xnat_projectData_summary_history");
            cacheTabs(context, "xnat_projectData/tabs");
        } catch (XFTInitException e) {
            logger.error("",e);
        } catch (ElementNotFoundException e) {
            logger.error("",e);
        } catch (DBPoolException e) {
            logger.error("",e);
        } catch (SQLException e) {
            logger.error("",e);
        } catch (IllegalAccessException e) {
            logger.error("",e);
        } catch (Exception e) {
            logger.error("",e);
        }
	}

}
