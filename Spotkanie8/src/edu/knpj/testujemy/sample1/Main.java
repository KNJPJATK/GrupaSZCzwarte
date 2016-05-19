package edu.knpj.testujemy.sample1;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {

        Socket socket = new Socket(); // tworzymy socket do TCP -> HTTP
        String hostName = "google.com";

        InetSocketAddress address = new InetSocketAddress(hostName, 80);

        try {
            socket.connect(address);
//            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
//            DataInputStream in = new DataInputStream(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String request = "GET / HTTP/1.1\r\n\r\n";
            out.println(request);
            out.flush();
            String response = in.readLine();

            while(response != null){
                System.out.println(response);
                response = in.readLine();
            }

            socket.close();
            out.close();
            in.close();

        } catch (IOException e) {
            System.err.println("Problem w komunikacji");
            e.printStackTrace();
            System.exit(1);
        }

    }
}
