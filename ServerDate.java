package Kratos;

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.util.*;

public class ServerDate extends UnicastRemoteObject implements InterDate {
    public ServerDate() throws RemoteException {
        super();  // Ensure the superclass constructor is initialized
    }

    public String display() throws RemoteException {
        return new Date().toString();  // Directly return the date as a string
    }

    public static void main(String args[]) {
        try {
            LocateRegistry.createRegistry(1099);  // Start RMI Registry on port 1099
            ServerDate s1 = new ServerDate();
            Naming.rebind("DS", s1);  // Use rebind() instead of bind()
            System.out.println("Server is running and object registered...");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}