/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationidologis;

import java.io.File;

/**
 *
 * @author denver
 */
public class FTPCLient {
    
    public static void main(String args[]) {

    }
    
    public void connect() {
        
    }
    
    public void login() {
        
    }
    
    public void FTPCLient() {
    FTPClient client = new FTPClient();
        String host = "192.168.176.10";
        String username = "eleve";
        String password = "eleve";
            try {
                client.connect(host);
                client.login(username, password);
                client.setFileType(FTPClient.BINARY_FILE_TYPE);
                File f = new File(rep);
                FileInputStrem in = new FileInputStrem("");
                client.storeFile("", in);

            }
    }


}
