import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        try {
            ServerSocket server = new ServerSocket(5000);

            System.out.println("Server is running...");
            System.out.println("Waiting for a client...");

            Socket client = server.accept();

            System.out.println("A client has connected!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}