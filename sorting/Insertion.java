import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class insertion {

    // public static void InsertionSort(int[] arr) {

    // for (int i = 1; i < arr.length; i++) {
    // int curr = arr[i];
    // int prev = i - 1;
    // // finding out the correct position
    // while (prev >= 0 && arr[prev] > curr) {
    // arr[prev + 1] = arr[prev];
    // prev--;
    // }
    // // insertion
    // arr[prev + 1] = curr;

    // }

    // }

    public static void printArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int arr[] = { 5, 4, 1, 2, 3, 8, 6 };
        // InsertionSort(arr);
        // Arrays.sort(arr);
        // Arrays.sort(arr, 2, 5); 2 is starting and 5 is ending
        Integer arr[] = { 5, 4, 1, 2, 3, 8, 6 };
        Arrays.sort(arr, Collections.reverseOrder()); // You can't use
        // Collections.reverseOrder() on a primitive int
        // array. One solution is to change the array type from int[] to
        Arrays.sort(arr, 2, 5, Collections.reverseOrder()); // Integer[]. For example, replace:

        printArr(arr);

    }
}