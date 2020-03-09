package com.sorting.java;

import java.util.List;

public class Heap implements Sort {
    public static void sorting(List<String> arr) {
        long startTime = Sort.startTimer();

        int n = arr.size();

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            String temp = arr.get(0);
            arr.set(0, arr.get(i));
            arr.set(i, temp);

            heapify(arr, i, 0);
        }

        System.out.println(Sort.endTimer() - startTime);
    }

    static void heapify(List<String> arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr.get(l).compareTo(arr.get(largest)) > 0) {
            largest = l;
        }

        if (r < n && arr.get(r).compareTo(arr.get(largest)) > 0) {
            largest = r;
        }

        if (largest != i) {
            String swap = arr.get(i);
            arr.set(i, arr.get(largest));
            arr.set(largest, swap);

            heapify(arr, n, largest);
        }
    }
}
