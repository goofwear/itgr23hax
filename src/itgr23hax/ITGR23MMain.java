/*
 * Main.java
 *
 * Created on December 23, 2008, 10:06 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package itgr23hax;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author infamouspat
 */
public class ITGR23MMain {
    
    public static String getMD5FileHash(String fileName) throws NoSuchAlgorithmException,IOException {
        byte buf[] = new byte[4080];
        int ret;
        MessageDigest m = MessageDigest.getInstance("MD5");
        FileInputStream fis = new FileInputStream(fileName);
        do {
            ret = fis.read(buf);
            m.update(buf, 0, ret);
        } while (fis.available() > 0);
        return new BigInteger(1,m.digest()).toString(16);
    }
    
    /** Creates a new instance of Main */
    public ITGR23MMain() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ITGR23Modifier mod = new ITGR23Modifier();
        mod.setVisible(true);
    }
    
}
