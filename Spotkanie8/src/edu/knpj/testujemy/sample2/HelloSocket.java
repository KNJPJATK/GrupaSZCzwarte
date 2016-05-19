package edu.knpj.testujemy.sample2;

import java.io.*;
import java.net.Socket;

/**
 * Created by andrew on 19.05.2016.
 */
public class HelloSocket implements Runnable {

    public String name;
    private final String host;
    private final int port;
    public Socket socket;


    public HelloSocket(String name, String host, int port){
        this.name = name;
        this.host = host;
        this.port = port;
    }

    @Override
    public void run() {
        try {
            System.out.println("Connecting...");
            socket = new Socket(host, port);
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            out.writeUTF(name);
            String response = in.readUTF();
            System.out.println(response);

        } catch (IOException e) {
            System.err.println("Error opening streams. Exiting...");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        HelloSocket helloSocket = new HelloSocket("Andrew", null, 9090);
        new Thread(helloSocket).start();
    }
}
