package com.sorting.java;

import java.util.List;

public class Merge implements Sort {

    public static void sorting(List<String> arr) {
        long startTime = Sort.startTimer();

        mergeSort(arr, 0, arr.size() - 1);

        System.out.println(Sort.endTimer() - startTime);
    }

    public static void mergeSort(List<String> arr, int from, int to) {
        if (from == to) {
            return;
        }

        int mid = (from + to) / 2;
        mergeSort(arr, from, mid);
        mergeSort(arr, mid + 1, to);
        merge(arr, from, mid, to);
    }

    public static void merge(List<String> arr, int from, int mid, int to) {
        int n = to - from + 1;
        String[] tempArray = new String[n];
        int leftCursor = from;
        int rightCursor = mid + 1;
        int j = 0;

        while (leftCursor <= mid && rightCursor <= to) {
            if (arr.get(leftCursor).compareTo(arr.get(rightCursor)) < 0) {
                tempArray[j] = arr.get(leftCursor);
                leftCursor++;
            } else {
                tempArray[j] = arr.get(rightCursor);
                rightCursor++;
            }
            j++;
        }

        while (leftCursor <= mid) {
            tempArray[j] = arr.get(leftCursor);
            leftCursor++;
            j++;
        }

        while (rightCursor <= to) {
            tempArray[j] = arr.get(rightCursor);
            rightCursor++;
            j++;
        }

        for (j = 0; j < n; j++) {
            arr.set(from + j, tempArray[j]);
        }
    }
}