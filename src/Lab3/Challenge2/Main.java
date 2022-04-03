package Lab3.Challenge2;

import java.util.Arrays;

public class Main {
    static void displaySorted(SortingStrategy strategy, Integer[] arr) {
        strategy.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
            if (i == arr.length - 1) {
                System.out.println(" ");
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1, 4, 5, 2, 3, 6, 9, 8 ,7};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        displaySorted(new BubleSort(), copy01OfArr);
        displaySorted(new MergeSort(), copy02OfArr);
    }
}
