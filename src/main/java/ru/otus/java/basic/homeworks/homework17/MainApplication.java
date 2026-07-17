package ru.otus.java.basic.homeworks.homework17;

import java.io.*;

public class MainApplication {
    public static void main(String[] args) {
        File file = new File(".");
        FilenameFilter filenameFilter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".txt");
            }
        };

        for (File f : file.listFiles(filenameFilter)) {
            System.out.println("Файлы которыми вы можете пользоваться: ");
            System.out.println(f.getName());
        }
    }


    private static void read(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void input(String message, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
