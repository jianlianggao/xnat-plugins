package org.nrg.xnat.turbine.modules.actions;

import org.apache.turbine.util.RunData;
import org.apache.velocity.context.Context;
import org.nrg.xdat.turbine.modules.actions.SecureAction;

/**
 * Created by gmlenz on 10/01/17.
 */
public class TorrentDownloadAction extends SecureAction {
    @Override
    public void doPerform(RunData data, Context context) throws Exception {
        data.setMessage("Download started");
        data.setScreenTemplate("Index.vm");
    }
}
