package Kratos;
import java.io.*;
import java.net.*;

class Calculator_Client {
    Calculator_Client() {
        try {
            InetAddress ia = InetAddress.getLocalHost();
            DatagramSocket ds = new DatagramSocket(); // Single socket for sending and receiving
            System.out.println("\nCalculator Client Started\n");
            System.out.println("Enter method name and parameters (e.g., add 3 4), or type 'exit' to quit:");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            byte[] buffer = new byte[1024]; // Buffer for receiving data

            while (true) {
                System.out.print(">> ");
                String str = br.readLine();

                // Exit condition
                if (str.equalsIgnoreCase("exit")) {
                    System.out.println("Client shutting down...");
                    break;
                }

                byte[] sendData = str.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, ia, 1200);
                ds.send(sendPacket);

                DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
                ds.receive(receivePacket);
                String response = new String(receivePacket.getData(), 0, receivePacket.getLength());

                System.out.println("Result = " + response + "\n");
            }

            ds.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Calculator_Client();
    }
}
