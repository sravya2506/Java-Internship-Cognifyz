import java.io.*;
import java.net.*;

public class ChatClient {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to server.");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader clientInput =
                    new BufferedReader(new InputStreamReader(System.in));

            String clientMsg, serverMsg;

            while (true) {
                System.out.print("Client: ");
                clientMsg = clientInput.readLine();
                out.println(clientMsg);

                if (clientMsg.equalsIgnoreCase("exit")) break;

                serverMsg = in.readLine();
                System.out.println("Server: " + serverMsg);
            }

            socket.close();
            System.out.println("Client disconnected.");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
