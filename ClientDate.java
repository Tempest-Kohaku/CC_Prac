package Kratos;

import java.rmi.*;

public class ClientDate {
    public static void main(String args[]) {
        try {
            InterDate h1 = (InterDate) Naming.lookup("rmi://localhost/DS");
            System.out.println("Current Date & Time from Server: " + h1.display());
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
