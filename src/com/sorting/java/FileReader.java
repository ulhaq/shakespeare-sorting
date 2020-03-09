package com.sorting.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FileReader {
    public static ArrayList<String> read(String path) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();

        try {
            Scanner s = new Scanner(new File(path));

            String processedWord;
            while (s.hasNext()) {
                processedWord = s.next().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
                list.add(processedWord);
                list.removeAll(Arrays.asList("", null));
            }
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return list;
    }
}
