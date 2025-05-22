import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class BubbleSort {

    // public static void Sorting(int[] arr) {

    // for (int turn = 0; turn < arr.length - 1; turn++) {
    // for (int i = 0; i < arr.length - 1 - turn; i++) {
    // if (arr[i] > arr[i + 1]) {
    // int temp = arr[i];
    // arr[i] = arr[i + 1];
    // arr[i + 1] = temp;
    // }
    // }
    // }
    // }

    public static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length - 2; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 1, 5, 8, 9, 6 };
        // Sorting(arr);
        SelectionSort(arr);
        printArr(arr);

    }

}