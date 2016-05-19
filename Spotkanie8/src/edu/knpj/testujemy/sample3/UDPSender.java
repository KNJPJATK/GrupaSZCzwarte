package edu.knpj.testujemy.sample3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * Created by andrew on 19.05.2016.
 */
public class UDPSender {

    public static void main(String[] args) {
        try {
            DatagramSocket datagramSocket = new DatagramSocket(1993);
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            InetSocketAddress address = new InetSocketAddress("172.23.65.142", 2020);
            byte[] outputData;
            while(true){
                byte[] inputData = new byte[50];
                String readLine = consoleReader.readLine();
                outputData = readLine.getBytes();



                DatagramPacket packetToSend = new DatagramPacket(outputData, outputData.length, address);
//            System.out.println("Sending...");
                datagramSocket.send(packetToSend);
//            System.out.println("Sent.");

                DatagramPacket receivedPacket = new DatagramPacket(inputData, inputData.length);
//            System.out.println("Receiving...");
                datagramSocket.receive(receivedPacket);
//            System.out.println("Received...");

                System.out.println("From: " + receivedPacket.getAddress().getHostName());

                String cappedString = new String(receivedPacket.getData());

                System.out.println("Capitalized string = " + cappedString);

            }

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
