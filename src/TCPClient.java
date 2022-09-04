import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

    static String link;
    static String ip;
    static int port;

    public static void main(String[] args) throws IOException {
        System.out.println("please enter name: ");
        User.name = new Scanner(System.in).nextLine();
        System.out.println("please enter surname: ");
        User.surname = new Scanner(System.in).nextLine();

        System.out.println("Please enter the link of the document you want to send: ");
        link = new Scanner(System.in).nextLine();

        System.out.println("enter the port and ip address of the person you want to send the file to: ");
        String serverInfo = new Scanner(System.in).nextLine();
        String[] arr = serverInfo.split(":");
        ip = arr[0];
        port = Integer.parseInt(arr[1]);

        Socket socket = new Socket(ip,port);
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        byte[] bytes = TCPClient.link.getBytes();
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
    }
}