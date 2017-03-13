package CS.CS003_02;

/**
 * Created by a on 12.03.2017.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;
//import java.util.*;

public class Server {
//    public Server() {
//    }

    public static void main(String[] arg) {
        short port = 7777;
//        InetAddress ia = new InetAddress();
//        byte[] ip = new byte[4];
//        ip = ia.getAddress();
//        System.out.println("IP Address: " +
//                (0xff & (int)ip[0]) + "." +
//                (0xff & (int)ip[1]) + "." +
//                (0xff & (int)ip[2]) + "." +
//                (0xff & (int)ip[3]));

        try {
            ServerSocket x = new ServerSocket(port);
            System.out.println("Waiting for a client...");
            Socket socket = x.accept();
            System.out.println("Got a client :) ... Finally, someone saw me through all the cover!");
            System.out.println();
            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();
            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);
            String line = null;

            while(true) {
                line = in.readUTF();
                System.out.println("The dumb client just sent me this line : " + line);
                System.out.println("I\'m sending it back...");
                out.writeUTF(line);
                out.flush();
                System.out.println("Waiting for the next line...");
                System.out.println();
            }
        } catch (Exception var9) {
            var9.printStackTrace();
        }
    }
}
