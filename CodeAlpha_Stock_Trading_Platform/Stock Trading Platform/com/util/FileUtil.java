package com.util;

import java.io.*;

public class FileUtil {

    public static void save(Object obj) {

        try (ObjectOutputStream oos =
                 new ObjectOutputStream(
                     new FileOutputStream("portfolio.dat"))) {

            oos.writeObject(obj);

        } catch (Exception e) {
            System.out.println("Save error");
        }
    }
}