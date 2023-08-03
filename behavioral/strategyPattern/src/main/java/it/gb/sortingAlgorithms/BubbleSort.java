package it.gb.sortingAlgorithms;

public class BubbleSort implements SortStrategy {

    @Override
    public int[] sort(int[] integerArrary) {
        
        int n = integerArrary.length;
        int[] sortedArr = new int[n];
        System.arraycopy(integerArrary, 0, sortedArr, 0, n);
        int swapVar = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (sortedArr[j - 1] > sortedArr[j]) {
                    swapVar = sortedArr[j - 1];
                    sortedArr[j - 1] = sortedArr[j];
                    sortedArr[j] = swapVar;
                }

            }
        }
        
        return sortedArr;
    }

}
