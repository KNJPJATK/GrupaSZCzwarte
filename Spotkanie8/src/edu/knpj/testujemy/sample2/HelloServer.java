package edu.knpj.testujemy.sample2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

/**
 * Created by andrew on 19.05.2016.
 */
public class HelloServer implements Runnable {

    private ServerSocket server;

    private HelloServer(int port) throws IOException {
        server = new ServerSocket(port);
    }

    @Override
    public void run() {
        while(true)
        {
            try
            {
                System.out.println("Waiting for next client...");
                Socket client = server.accept();
                DataInputStream in = new DataInputStream(client.getInputStream());
                DataOutputStream out = new DataOutputStream(client.getOutputStream());

                String name = in.readUTF();
                System.out.println("A client has connected! Her/his name is: " + name);
                out.writeUTF("Hello " + name + "!");

                client.close();
                in.close();
                out.close();
            }catch(SocketTimeoutException s)
            {
                System.out.println("Socket timed out!");
                break;
            }catch(IOException e)
            {
                e.printStackTrace();
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            HelloServer helloServer = new HelloServer(9090);
            new Thread(helloServer).start();
        } catch (IOException e) {
            System.err.println("Problem estabishing server. Exiting...");
            System.exit(1);
        }
    }
}
