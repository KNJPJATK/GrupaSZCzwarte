package edu.knpj.testujemy.sample2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by andrew on 19.05.2016.
 */
public class HelloServer implements Runnable {

    private ServerSocket serverSocket;

    private HelloServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
    }

    /*
        Hostname: 172.23.65.98
        Port: 9090
     */

    @Override
    public void run() {
        while(true){
//            Socket socket = new Socket("172.23.65.98", 9090);
            try {
                System.out.println("Oczekuje na polaczenie");
                Socket clientSocket = serverSocket.accept();

                if (clientSocket.getInetAddress().getHostAddress().endsWith("1.157")){
//                    continue;
                }

                DataInputStream in = new DataInputStream(clientSocket.getInputStream());
                String nazwa =  in.readUTF();

                DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
                String response = "Hello " + nazwa + "!";
                System.out.println("Odpowiedz: = [" + response + "]");
                System.out.println("Od: " + clientSocket.getInetAddress().getHostAddress());

                out.writeUTF(response);

            } catch (IOException e) {
                System.err.println("Blad w dzialaniu serwera.");
                run();
            }
        }
    }

    public static void main(String[] args) {
        try {
            new Thread(new HelloServer(9090)).start();
        } catch (IOException e) {
            System.err.println("Blad przy tworzeniu serwera.");
            e.printStackTrace();
        }
    }
}
