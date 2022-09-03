import java.util.Scanner;

public class Main {

    static String link;
    static String ip;
    static int port;

    public static void main(String[] args) {
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
    }
}