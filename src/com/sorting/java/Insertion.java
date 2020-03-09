package com.sorting.java;

import java.util.List;

public class Insertion implements Sort {
    public static void sorting(List<String> arr) {
        long startTime = Sort.startTimer();

        for (int i = 1; i < arr.size(); i++) {
            String key = arr.get(i);
            int j = i - 1;

            while (j >= 0 && key.compareTo(arr.get(j)) < 0) {
                arr.set(j + 1, arr.get(j));
                j--;
            }
            arr.set(j + 1, key);
        }

        System.out.println(Sort.endTimer() - startTime);
    }
}