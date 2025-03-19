package Kratos;
import java.net.*;
public class Broadcaster_Client {
        public static final int PORT = 1234;
        public static void main(String args[]) {
            try {
                MulticastSocket socket;
                DatagramPacket packet;
                InetAddress address;

                // Set the multicast group address
                address = InetAddress.getByName("239.1.2.3");
                socket = new MulticastSocket(PORT);

                // Join the multicast group
                socket.joinGroup(address);
                System.out.println("Joined multicast group. Listening for messages...");

                byte[] data = new byte[100];
                packet = new DatagramPacket(data, data.length);

                while (true) {
                    // Receive the packets
                    socket.receive(packet);
                    String str = new String(packet.getData(), 0, packet.getLength()); // Proper string conversion

                    // Print message and sender's address
                    System.out.println("Message received from Manas" + " : " + str);

                    // Exit condition
                    if (str.equalsIgnoreCase("exit")) {
                        System.out.println("Exit signal received. Leaving multicast group...");
                        break;
                    }
                }
                // Leave multicast group and close socket
                socket.leaveGroup(address);
                socket.close();
                System.out.println("Client shut down.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }