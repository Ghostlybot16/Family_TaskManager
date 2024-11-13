//import java.io.*;
//import java.net.*;
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class Server {
//    private static final int PORT = 12345;
//
//    public static void main(String[] args) {
//        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
//            System.out.println("Server is running and waiting for clients to connect...");
//
//            while (true) {
//                Socket clientSocket = serverSocket.accept();
//                System.out.println("Client connected: " + clientSocket.getInetAddress());
//
//                // Create a new thread to handle client communication
//                new Thread(new ClientHandler(clientSocket)).start();
//            }
//        } catch (IOException e) {
//            System.out.println("Server exception: " + e.getMessage());
//            e.printStackTrace();
//        }
//    }
//}
//
//class ClientHandler implements Runnable {
//    private Socket clientSocket;
//    private static List<Task> tasks = new ArrayList<>(); // Shared list of tasks
//
//    public ClientHandler(Socket socket) {
//        this.clientSocket = socket;
//    }
//
//    @Override
//    public void run() {
//        try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {
//
//            out.println("Welcome to the Family Task Manager!");
//
//            String clientMessage;
//            while ((clientMessage = in.readLine()) != null) {
//                // Convert the command to uppercase for case-insensitive comparison
//                String[] parts = clientMessage.split(" ", 3);
//
//                // Check if there's at least one part (the command) in the input
//                if (parts.length > 0) {
//                    String command = parts[0].toUpperCase();  // Convert to uppercase for consistent handling
//
//                    if (command.equals("ADD_TASK") && parts.length == 3) {
//                        String taskName = parts[1];
//                        String taskDescription = parts[2];
//                        Task newTask = new Task(taskName, taskDescription);
//                        tasks.add(newTask);
//                        out.println("Task added successfully: " + newTask);
//                    } else {
//                        out.println("Unknown command. Available commands: ADD_TASK <name> <description>");
//                    }
//                } else {
//                    out.println("Error: Invalid command format.");
//                }
//            }
//
//        } catch (IOException e) {
//            System.out.println("Client disconnected: " + e.getMessage());
//        }
//    }
//}
//
//
