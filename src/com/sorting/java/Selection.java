package com.sorting.java;

import java.util.List;

public class Selection implements Sort {
    public static void sorting(List<String> arr) {
        long startTime = Sort.startTimer();

        for (int i = 0; i < arr.size() - 1; i++) {
            int index = i;

            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j).compareTo(arr.get(index)) < 0) {
                    index = j;
                }
            }

            String smaller = arr.get(index);
            arr.set(index, arr.get(i));
            arr.set(i, smaller);
        }

        System.out.println(Sort.endTimer() - startTime);
    }
}