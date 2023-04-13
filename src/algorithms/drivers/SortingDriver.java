package algorithms.drivers;

import algorithms.sorting.BubbleSort;
import algorithms.sorting.InsertionSort;
import algorithms.sorting.QuickSort;
import algorithms.sorting.SelectionSort;

import java.util.Arrays;
import java.util.List;

public class SortingDriver {
    public static void start() {
        List<Integer> arr = Arrays.asList(2, 5, 6, 3, 1, 4);
        new SelectionSort().sort(arr, arr.size());
        new QuickSort().sort(arr, arr.size());
        new InsertionSort().sort(arr, arr.size());
        new BubbleSort().sort(arr, arr.size());
    }
}
