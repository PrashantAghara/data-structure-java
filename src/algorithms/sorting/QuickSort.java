package algorithms.sorting;

import java.util.List;

public class QuickSort {
    public void sort(List<Integer> arr, int size) {
        quickSort(arr, 0, size);
        System.out.println("Sorted Array (QUICK) : " + arr);
    }

    public void quickSort(List<Integer> arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int p = partition(arr, start, end);
        quickSort(arr, start, p - 1);
        quickSort(arr, p + 1, end);
    }

    public int partition(List<Integer> arr, int start, int end) {
        int pivot = arr.get(start);
        int count = 0;
        for (int i = start + 1; i < end; i++) {
            if (arr.get(i) < pivot) {
                count++;
            }
        }
        int i = start, j = end;
        while (i < start + count && j > start + count) {
            while (arr.get(i) < pivot) {
                i++;
            }
            while (arr.get(j) > pivot) {
                j--;
            }
            if (i < start + count && j > start + count) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
                i++;
                j++;
            }
        }
        return start + count;
    }
}
