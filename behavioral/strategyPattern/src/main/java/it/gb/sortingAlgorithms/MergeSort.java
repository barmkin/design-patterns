package it.gb.sortingAlgorithms;

import java.util.Arrays;

public class MergeSort implements SortStrategy {

    @Override
    public int[] sort(int[] integerArray) {
        if (integerArray.length <= 1) {
            return integerArray;
        }

        int middle = integerArray.length / 2;
        int[] left = Arrays.copyOfRange(integerArray, 0, middle);
        int[] right = Arrays.copyOfRange(integerArray, middle, integerArray.length);

        left = sort(left);
        right = sort(right);

        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int mergedIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] <= right[rightIndex]) {
                merged[mergedIndex] = left[leftIndex];
                leftIndex++;
            } else {
                merged[mergedIndex] = right[rightIndex];
                rightIndex++;
            }
            mergedIndex++;
        }

        while (leftIndex < left.length) {
            merged[mergedIndex] = left[leftIndex];
            leftIndex++;
            mergedIndex++;
        }

        while (rightIndex < right.length) {
            merged[mergedIndex] = right[rightIndex];
            rightIndex++;
            mergedIndex++;
        }

        return merged;
    }
    
}
