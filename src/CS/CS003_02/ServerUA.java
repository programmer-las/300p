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

public class ServerUA {
    public static void main (String [] arg) {
        int port = 7776; // Випадковий порт (може бути будь-яке число від 1 025 до 65535)
        try {
            ServerSocket ss = new ServerSocket(port); // Створюємо сокет сервера і прив'язуємо його до вищезазначеного порту
            System.out.println ( "Очікування клієнта ...");

            Socket socket = ss.accept(); // Змушуємо сервер чекати підключень і виводимо повідомлення коли хтось зв'язався з сервером
            System.out.println ( "Є клієнт :) ... Очікую на інформацію");
            System.out.println ();

            // Беремо вхідний і вихідний потоки сокета, тепер можемо отримувати і відсилати дані клієнта.
            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream ();

            // Конвертуємо потоки в інший тип, щоб легше обробляти текстові повідомлення.
            DataInputStream in = new DataInputStream (sin);
            DataOutputStream out = new DataOutputStream (sout);

            String line = null;
            while (true) {
                line = in.readUTF (); // Очікуємо поки клієнт надішле рядок тексту.
                System.out.println ( "Отримано від клієнта такі дані:" + line);
                System.out.println ( "Відправка даних клієнту ...");
                out.writeUTF (line); // Відсилаємо клієнту назад ту саму рядок тексту.
                out.flush (); // Змушуємо потік закінчити передачу даних.
                System.out.println ( "Очікую на інформацію ...");
                System.out.println ();
            }
        } catch (Exception x) {x.printStackTrace (); }
    }
}
