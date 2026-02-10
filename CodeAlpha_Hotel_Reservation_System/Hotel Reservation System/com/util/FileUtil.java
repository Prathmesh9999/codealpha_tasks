package com.util;

import java.io.*;
import java.util.Map;

public class FileUtil {

    public static void save(Map<?, ?> data) {

        try (ObjectOutputStream oos =
                 new ObjectOutputStream(
                     new FileOutputStream("reservations.dat"))) {

            oos.writeObject(data);

        } catch (Exception e) {
            System.out.println("File save error");
        }
    }
}