package CS.CS003_02;
/**
 * Created by a on 12.03.2017.
 */
        import java.io.BufferedReader;
        import java.io.DataInputStream;
        import java.io.DataOutputStream;
        import java.io.InputStream;
        import java.io.InputStreamReader;
        import java.io.OutputStream;
        import java.net.InetAddress;
        import java.net.Socket;

public class ClientNoComment {

    public static void main(String[] ar) {
        short serverPort = 7777;
        String address = "localhost";
//        String address = "10.0.1.102";

        try {
            InetAddress x = InetAddress.getByName(address);
            System.out.println("Any of you heard of a socket with IP address " + address + " and port " + serverPort + "?");
            Socket socket = new Socket(x, serverPort);
            System.out.println("Yes! I just got hold of the program.");
            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();
            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            System.out.println("Type in something and press enter. Will send it to the server and tell ya what it thinks.");
            System.out.println();

            while(true) {
                line = keyboard.readLine();
                System.out.println("Sending this line to the server...");
                out.writeUTF(line);
                out.flush();
                line = in.readUTF();
                System.out.println("The server was very polite. It sent me this : " + line);
                System.out.println("Looks like the server is pleased with us. Go ahead and enter more lines.");
                System.out.println();
            }
        } catch (Exception var11) {
            var11.printStackTrace();
        }
    }
}

