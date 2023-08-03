package it.gb.sortingAlgorithms;

import java.util.Random;

public abstract class SortingAlgorithmsApp {

    private static int[] generateRandomIntArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(); // Generates a random integer
        }

        return array;
    }

    
    public static void executeSortingAlgorithmsApp() {

        // Create an array of int
        int[] a = SortingAlgorithmsApp.generateRandomIntArray(100000);
        int[] b;

        // Create a sorting context
        SortingContext sortingContext = new SortingContext();

        // Select a sort algotithm
        sortingContext.setSortStrategy(new BubbleSort());
        // Execute
        b = sortingContext.sort(a);

        // Select another sort algotithm
        sortingContext.setSortStrategy(new MergeSort());
        // Execute
        b = sortingContext.sort(a);

        // Select another sort algotithm
        sortingContext.setSortStrategy(new QuickSort());
        // Execute
        b = sortingContext.sort(a);

        // Print a number every 10000
        for (int i = 0; i < b.length; i+=10000) {
            System.out.println(b[i]);
        }

    }
}
