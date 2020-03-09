package com.sorting.java;

import java.io.FileNotFoundException;
import java.util.List;

import static com.sorting.java.FileReader.read;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Time complexity O(n^2)
        List<String> SelList = read("src/com/sorting/resources/Shakespeare_Short.txt");
        Selection.sorting(SelList);
        System.out.println("Selection Sort: " + SelList.toString());

        // Time complexity O(n^2)
        List<String> InsList = read("src/com/sorting/resources/Shakespeare_Short.txt");
        Insertion.sorting(InsList);
        System.out.println("Insertion Sort: " + InsList.toString());

        // Time complexity O(n*log(n))
        List<String> HeaList = read("src/com/sorting/resources/Shakespeare_Short.txt");
        Heap.sorting(HeaList);
        System.out.println("Heap Sort: " + HeaList.toString());

        // Time complexity O(n*log(n))
        List<String> MerList = read("src/com/sorting/resources/Shakespeare_Short.txt");
        Merge.sorting(MerList);
        System.out.println("Merge Sort: " + MerList.toString());
    }
}
