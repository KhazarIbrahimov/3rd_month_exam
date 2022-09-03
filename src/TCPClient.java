import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    Socket socket ;
    static byte[] bytes;


    public TCPClient() throws IOException {
        while (true){
            socket = new Socket("192.168.31.8",2222);
            OutputStream outputStream = socket.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

            byte[] bytes = Main.link.getBytes();
            dataOutputStream.writeInt(bytes.length);
            dataOutputStream.write(bytes);
        }

//        dataOutputStream.write(bytes);
//        dataOutputStream.close();
    }

}
