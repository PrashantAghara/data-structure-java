package algorithms.sorting;

import java.util.List;

public class BubbleSort {
    public void sort(List<Integer> arr, int size) {
        boolean swap = false;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        System.out.println("Sorted Array (BUBBLE) : " + arr);
    }
}
