package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();

        File src = new File("C://Games", "src");
        if (src.mkdir()) {
            str.append("Yes\n");
        }

        File res = new File("C://Games", "res");
        if (res.mkdir()) {
            str.append("Yes\n");
        }

        File savegames = new File("C://Games", "savegames");
        if (savegames.mkdir()) {
            str.append("Yes\n");
        }

        File temp = new File("C://Games", "temp");
        if (temp.mkdir()) {
            str.append("Yes\n");
        }

        File srcMain = new File("C://Games//src", "main");
        if (srcMain.mkdir()) {
            str.append("Yes\n");
        }

        File srcTest = new File("C://Games//src", "test");
        if (srcTest.mkdir()) {
            str.append("Yes\n");
        }

        File newMain = new File("C://Games//src//main", "Main.java");
        try {
            if (newMain.createNewFile())
                str.append("Create\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        File newUtils = new File("C://Games//src//main", "Utils.java");
        try {
            if (newUtils.createNewFile())
                str.append("Create\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        File drawables = new File("C://Games//res", "drawables");
        if (drawables.mkdir()) {
            str.append("Yes\n");
        }

        File vectors = new File("C://Games//res", "vectors");
        if (vectors.mkdir()) {
            str.append("Yes\n");
        }

        File icons = new File("C://Games//res", "icons");
        if (icons.mkdir()) {
            str.append("Yes\n");
        }

        File newTemp = new File("C://Games//temp", "temp.txt");
        try {
           if (newTemp.createNewFile())
               str.append("Create\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileWriter writer = new FileWriter("C://Games//temp//temp.txt", false)) {
            writer.write(String.valueOf(str));
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}