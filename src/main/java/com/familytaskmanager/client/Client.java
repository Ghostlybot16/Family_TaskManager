//package main.java.client;
//
//import java.io.*;
//import java.net.*;
//
//public class Client {
//    private static final String SERVER_ADDRESS = "127.0.0.1"; // Localhost
//    private static final int PORT = 12345;
//
//    public static void main(String[] args) {
//        try (Socket socket = new Socket(SERVER_ADDRESS, PORT);
//             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
//             BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in))) {
//
//            System.out.println("Connected to the server.");
//            System.out.println("Server says: " + in.readLine());
//
//            String userInput;
//            while (true) {
//                System.out.print("Enter command: ");
//                userInput = consoleInput.readLine();
//
//                if (userInput.startsWith("ADD_TASK")) {
//                    out.println(userInput); // Send to server
//                    System.out.println(in.readLine()); // Server response
//                } else {
//                    System.out.println("Unknown command. Available commands: ADD_TASK <name> <description>");
//                }
//            }
//
//        } catch (IOException e) {
//            System.out.println("Client exception: " + e.getMessage());
//            e.printStackTrace();
//        }
//    }
//}
