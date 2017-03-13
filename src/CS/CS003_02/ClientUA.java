package CS.CS003_02;

/**
 * Created by a on 12.03.2017.
 */
import java.net.*;
import java.io.*;

public class ClientUA {
    public static void main (String [] ar) {
        int serverPort = 7776; // Тут обов'язково потрібно вказати порт до якого прив'язується сервер.
        String address = "127.0.0.1"; // Це IP-адреса комп'ютера, де виповнюється наша серверне програмне забезпечення.
        // Тут адреса був призначений додатковий того самого комп'ютера де буде виконуватися і клієнт.

        try {
            InetAddress ipAddress = InetAddress.getByName (address); // Створюємо об'єкт який відображає вищеописаний IP-адреса.
            System.out.println ( "Спроба встановлення зв'язку із сервером за ІР-адресою " + address + " та портом " + serverPort + ".");
            Socket socket = new Socket (ipAddress, serverPort); // Створюємо сокет використовуючи IP-адреса і порт сервера.
            System.out.println ( "Зв'язок встановлено.");

            // Беремо вхідний і вихідний потоки сокета, тепер можемо отримувати і відсилати дані клієнтом.
            InputStream sin = socket.getInputStream ();
            OutputStream sout = socket.getOutputStream ();

            // Конвертуємо потоки в інший тип, щоб легше обробляти текстові повідомлення.
            DataInputStream in = new DataInputStream (sin);
            DataOutputStream out = new DataOutputStream (sout);

            // Створюємо потік для читання з клавіатури.
            BufferedReader keyboard = new BufferedReader (new InputStreamReader (System.in));
            String line = null;
            System.out.println ( "Щоб передати інформацію серверу, необхідно набрати текст і натиснути Enter.");
            System.out.println ();

            while (true) {
                line = keyboard.readLine (); // Чекаємо поки користувач введе щось і натисне кнопку Enter.
                System.out.println ( "Відбувається передача інформації на сервер ...");
                out.writeUTF (line); // Відсилаємо введений рядок тексту сервера.
                out.flush (); // Змушуємо потік закінчити передачу даних.
                line = in.readUTF (); // Чекаємо поки сервер відішле рядок тексту.
                System.out.println ( "Отримано такі дані з серверу:" + line);
                System.out.println ( "Клієнт готовий до передачі нової інформації.");
                System.out.println ();
            }
        } catch (Exception x) {
            x.printStackTrace ();
        }
    }
}