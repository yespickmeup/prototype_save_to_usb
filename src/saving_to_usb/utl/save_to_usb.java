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
public class save_to_usb {

    public static void save(File file, Object o) {

        try {
            // save the file here
            String filename = file.getAbsoluteFile() + ".secret";
            Lg.$.info(filename);
            ObjectSerPersister osp = new ObjectSerPersister(filename);
            osp.openSerFile();
            osp.persist(o);

        } catch (Exception e) {
            Lg.$.info(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
