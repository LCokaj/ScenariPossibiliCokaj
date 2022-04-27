
package scenari_possibili_cokaj;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestoreClient 
{
     public static void main(String[] args) 
     {
         try {
             Client cli= new Client(InetAddress.getLocalHost(),2000);
             String str=cli.leggi();
         } catch (UnknownHostException ex) {
             Logger.getLogger(GestoreClient.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
    
}
