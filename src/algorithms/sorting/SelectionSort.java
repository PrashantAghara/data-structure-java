package algorithms.sorting;

import java.util.List;

public class SelectionSort {
    public void sort(List<Integer> arr, int size) {
        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (arr.get(min) > arr.get(j)) {
                    min = j;
                }
            }
            int temp = arr.get(i);
            arr.set(i, arr.get(min));
            arr.set(min, temp);
        }
        System.out.println("Sorted List (SELECTION) : " + arr);
    }
}
