package Kratos;

import java.net.*;
import java.io.*;

class IsPrime_Server {
    public static void main(String args[]) {
        try {
            ServerSocket ss = new ServerSocket(8001);
            System.out.println("Server Started...............");
            Socket s = ss.accept();
            DataInputStream in = new DataInputStream(s.getInputStream());
            int x = in.readInt();
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            if (x <= 1) {
                dout.writeUTF(x + " is not Prime");
            } else if (x == 2) {
                dout.writeUTF(x + " is Prime");
            } else {
                boolean isPrime = true;
                for (int i = 2; i <= x / 2; i++) {
                    if (x % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    dout.writeUTF(x + " is Prime");
                } else {
                    dout.writeUTF(x + " is not Prime");
                }
            }
            in.close();
            dout.close();
            s.close();
            ss.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}