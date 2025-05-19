// counting sort code

import java.util.*;

public class countingSort {

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        System.out.print("Initially count array is: ");
        printArr(count);
        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            System.out.println("i = " + i);
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
            System.out.print("Count array after " + i + " iterations is: ");
            printArr(count);
            System.out.print("Arr array after " + i + " iterations is: ");
            printArr(arr);
            System.out.println();
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        countingSort(arr);
        System.out.println();
        System.out.print("Array after sorting is: ");
        printArr(arr);
    }
}