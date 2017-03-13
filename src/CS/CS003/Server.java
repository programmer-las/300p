//package CS.CS003;
//
///**
// * Created by a on 12.03.2017.
// */
//import java.net. *;
//import java.io. *;
//public class Server {
//    public static void main (String [] ar) {
//        int port = 6666; // Випадковий порт (може бути будь-яке число від 1 025 до 65535)
//        try {
//            ServerSocket ss = new ServerSocket(port); // Створюємо сокет сервера і прив'язуємо його до вищезазначеного порту
//            System.out.println ( "Waiting for a client ...");
//
//            Socket socket = ss.accept (); // Змушуємо сервер чекати підключень і виводимо повідомлення коли хтось зв'язався з сервером
//            System.out.println ( "Got a client :) ... Finally, someone saw me through all the cover!");
//            System.out.println ();
//
//            // Беремо вхідний і вихідний потоки сокета, тепер можемо отримувати і відсилати дані клієнта.
//            InputStream sin = socket.getInputStream();
//            OutputStream sout = socket.getOutputStream();
//
//            // Конвертуємо потоки в інший тип, щоб легше обробляти текстові повідомлення.
//            DataInputStream in = new DataInputStream (sin);
//            DataOutputStream out = new DataOutputStream (sout);
//
//            String line = null;
//            while (true) {
//                line = in.readUTF (); // Очікуємо поки клієнт надішле рядок тексту.
//                System.out.println ( "The dumb client just sent me this line:" + line);
//                System.out.println ( "I'm sending it back ...");
//                out.writeUTF (line); // Відсилаємо клієнту назад ту саму рядок тексту.
//                out.flush (); // Змушуємо потік закінчити передачу даних.
//                System.out.println ( "Waiting for the next line ...");
//                System.out.println ();
//            }
//        } Catch (Exception x) {x.printStackTrace (); }
//    }
//}
