
package scenari_possibili_cokaj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Client 
{
    Socket so;
    BufferedReader br;
    public Client(InetAddress ip, int porta)
    {
        try {
            so=new Socket(ip,porta);
            br=new BufferedReader(new InputStreamReader(so.getInputStream()));
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public String leggi()
    {
        String msg="";
        try {
            msg=br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
                
           return msg;     
    }
}
