package com.sorting.java;

import java.util.List;

public class Heap implements Sort {
    public static void sorting(List<String> arr) {
        long startTime = Sort.startTimer();

        int n = arr.size();

        for (int k = n / 2; k >= 1; k--) {
            sink(arr, k, n);
        }

        int k = n;
        while (k > 1) {
            swap(arr, 1, k--);
            sink(arr, 1, k);
        }

        System.out.println(Sort.endTimer() - startTime);
    }

    private static void sink(List<String> arr, int k, int n) {
        while (2 * k <= n) {
            int j = 2 * k;

            if (j < n && less(arr, j, j + 1)) {
                j++;
            }

            if (!less(arr, k, j)) {
                break;
            }

            swap(arr, k, j);

            k = j;
        }
    }

    private static boolean less(List<String> arr, int i, int j) {
        return arr.get(i - 1).compareTo(arr.get(j - 1)) < 0;
    }

    private static void swap(List<String> arr, int i, int j) {
        String temp = arr.get(i - 1);
        arr.set(i - 1, arr.get(j - 1));
        arr.set(j - 1, temp);
    }
}
