package ru.otus.java.basic.homeworks.homework18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (
                Socket socket = new Socket("localhost", 8080);
                DataInputStream in = new DataInputStream(socket.getInputStream());
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                Scanner scanner = new Scanner(System.in)
        ) {
            while (true) {
                System.out.print("Введите сообщение для сервера (или 'exit' для выхода): ");
                String message = scanner.nextLine();

                if ("exit".equalsIgnoreCase(message)) {
                    break;
                }
                out.writeUTF(message);
                out.flush();
                String response = in.readUTF();
                System.out.println("Ответ от сервера: " + response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
