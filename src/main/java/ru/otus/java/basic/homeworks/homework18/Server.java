package ru.otus.java.basic.homeworks.homework18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            Socket client = serverSocket.accept();
            while (true) {
                try (
                        DataInputStream in = new DataInputStream(client.getInputStream());
                        DataOutputStream out = new DataOutputStream(client.getOutputStream())
                ) {
                    System.out.println("client.getPort() = " + client.getPort());
                    String userInput = in.readUTF();
                    System.out.println("userInput = " + userInput);
                    String result = transformStringToUpperCase(userInput);
                    System.out.println("result = " + result);
                    out.writeUTF(result);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String transformStringToUpperCase(String userInput) {
        System.out.println("Выполняем трансформацию!");
        return userInput.toUpperCase();
    }
}
