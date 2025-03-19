package Kratos;

import java.net.*;
import java.util.StringTokenizer;

public class Calculator_Server {
    private DatagramSocket ds;
    private DatagramPacket dp;
    private String methodName, result;
    private int val1, val2;

    public Calculator_Server() {
        try {
            ds = new DatagramSocket(1200); // Bind to port 1200
            byte[] buffer = new byte[1024]; // Buffer for incoming data

            System.out.println("Calculator Server started on port 1200...");

            while (true) {
                dp = new DatagramPacket(buffer, buffer.length);
                ds.receive(dp);
                String str = new String(dp.getData(), 0, dp.getLength()).trim();

                // Exit condition
                if (str.equalsIgnoreCase("q")) {
                    System.out.println("Shutting down server...");
                    ds.close();
                    System.exit(0);
                }

                System.out.println("Received request: " + str);

                // Parse input string
                StringTokenizer st = new StringTokenizer(str, " ");
                if (st.countTokens() < 3) {
                    result = "Error: Invalid input format";
                } else {
                    try {
                        methodName = st.nextToken();
                        val1 = Integer.parseInt(st.nextToken());
                        val2 = Integer.parseInt(st.nextToken());

                        // Perform requested operation
                        switch (methodName.toLowerCase()) {
                            case "add":
                                result = String.valueOf(add(val1, val2));
                                break;
                            case "sub":
                                result = String.valueOf(sub(val1, val2));
                                break;
                            case "mul":
                                result = String.valueOf(mul(val1, val2));
                                break;
                            case "div":
                                if (val2 == 0) {
                                    result = "Error: Division by zero";
                                } else {
                                    result = String.valueOf(div(val1, val2));
                                }
                                break;
                            default:
                                result = "Error: Unknown method";
                        }
                    } catch (NumberFormatException e) {
                        result = "Error: Invalid number format";
                    }
                }

                // Send response back to client
                byte[] responseData = result.getBytes();
                DatagramPacket responsePacket = new DatagramPacket(
                        responseData, responseData.length, dp.getAddress(), dp.getPort()
                );

                ds.send(responsePacket);
                System.out.println("Result sent: " + result + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int sub(int a, int b) {
        return a - b;
    }

    private int mul(int a, int b) {
        return a * b;
    }

    private int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        new Calculator_Server();
    }
}
