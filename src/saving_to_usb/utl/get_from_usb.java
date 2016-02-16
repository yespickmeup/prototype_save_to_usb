/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package saving_to_usb.utl;

import java.io.File;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.ObjectSerPersister;

/**
 *
 * @author mijzcx
 */
public class get_from_usb {

    public static Object get(File file) {
        try {

            String filename = file.getAbsolutePath();
            Lg.$.info(filename);
            ObjectSerPersister osp = new ObjectSerPersister(filename);
            osp.openSerFile();
            Lg.$.info(Boolean.toString(osp.hasLeftOver()));
            return osp.loadLeftOver();


        } catch (Exception e) {
            Lg.$.severe("Invalid format");
            throw new RuntimeException(e);
        }
    }
}
