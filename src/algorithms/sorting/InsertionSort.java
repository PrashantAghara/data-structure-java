package algorithms.sorting;

import java.util.List;

public class InsertionSort {
    public void sort(List<Integer> arr, int size) {
        for (int i = 1; i < size - 1; i++) {
            int temp = arr.get(i);
            int j = i - 1;
            while (j > 0) {
                if (arr.get(j) > arr.get(i)) {
                    arr.set(j + 1, arr.get(j));
                } else {
                    break;
                }
                j--;
            }
            arr.set(j + 1, arr.get(i));
        }
        System.out.println("Sorted Array (INSERTION) : " + arr);
    }
}
