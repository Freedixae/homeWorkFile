package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static StringBuilder str = new StringBuilder();

    public static void main(String[] args) {
        newDir("C://Games", "src");
        newDir("C://Games", "res");
        newDir("C://Games", "savegames");
        newDir("C://Games", "temp");
        newDir("C://Games//res", "drawables");
        newDir("C://Games//res", "vectors");
        newDir("C://Games//res", "icons");
        newDir("C://Games//src", "main");
        newDir("C://Games//src", "test");
        newFile("C://Games//src//main", "Main.java");
        newFile("C://Games//src//main", "Utils.java");
        newFile("C://Games//temp", "temp.txt");

        try (FileWriter writer = new FileWriter("C://Games//temp//temp.txt", false)) {
            writer.write(String.valueOf(str));
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void newDir(String path, String name) {
        File file = new File(path, name);
        if (file.mkdir()) {
            str.append("Done newDir!\n");
        }
    }

    public static void newFile(String path, String name) {
        File file = new File(path, name);
        try {
            if (file.createNewFile())
                str.append("Done newFile!\n");
        } catch (IOException e) {
            str.append("Done newDir!\n");
        }
    }
}