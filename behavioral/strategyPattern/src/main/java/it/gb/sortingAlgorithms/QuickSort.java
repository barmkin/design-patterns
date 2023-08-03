package it.gb.sortingAlgorithms;

import java.util.Arrays;

public class QuickSort implements SortStrategy {

    @Override
    public int[] sort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int pivotIndex = arr.length / 2;
        int pivot = arr[pivotIndex];

        int[] less = new int[arr.length];
        int[] greater = new int[arr.length];
        int lessIndex = 0;
        int greaterIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == pivotIndex) {
                continue;
            }
            
            if (arr[i] <= pivot) {
                less[lessIndex++] = arr[i];
            } else {
                greater[greaterIndex++] = arr[i];
            }
        }

        int[] sortedLess = Arrays.copyOf(less, lessIndex);
        int[] sortedGreater = Arrays.copyOf(greater, greaterIndex);

        sortedLess = this.sort(sortedLess);
        sortedGreater = this.sort(sortedGreater);

        return QuickSort.concatenateArrays(sortedLess, pivot, sortedGreater);
    }

    private static int[] concatenateArrays(int[] arr1, int pivot, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length + 1];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        
        result[arr1.length] = pivot;
        
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + 1 + i] = arr2[i];
        }

        return result;
    }
    
}
