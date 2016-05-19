package edu.knpj.testujemy.sample1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) {

        Socket socket = new Socket();
        String host = "www.google.com";
        InetSocketAddress address = new InetSocketAddress(host, 80);
        PrintWriter writer;
        BufferedReader reader;

        try {
            socket.connect(address);
            writer = new PrintWriter(socket.getOutputStream());
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String message = "GET / HTTP/1.1\r\n\r\n";

            writer.println(message);
            writer.flush();

            for (String response = reader.readLine(); response != null; response = reader.readLine()){
                System.out.println(response);
            }

            writer.close();
            reader.close();
            socket.close();

        } catch (UnknownHostException e) {
            System.err.println("Don't know about host : " + host);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Bład podczas IO");
            System.exit(1);
        }
    }
}
