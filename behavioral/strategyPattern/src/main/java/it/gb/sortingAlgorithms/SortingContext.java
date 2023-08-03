package it.gb.sortingAlgorithms;

public class SortingContext {
    
    private SortStrategy sortStrategy;

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public int[] sort(int[] arr) {
        long start = System.nanoTime();
        int[] sortedArr = this.sortStrategy.sort(arr);
        long end = System.nanoTime();
        System.out.println("Executed in " + (Float.parseFloat(end+"") - Float.parseFloat(start+""))/1000000000 + " s");
        return sortedArr;
    }
}
