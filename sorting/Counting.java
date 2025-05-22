import java.util.*;

public class Counting {

    public static void CountingSort(int arr[]) {

        int largest = Integer.MIN_VALUE;
        // comapre the lagest within the arr
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        // count the occurrences of each number
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        // Starts a loop to iterate over each possible integer value from 0 up to
        // largest (using the count array indices).
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;

            }
        }

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 1, 1, 2, 3, 2, 3, 7, 4, 4 };
        CountingSort(arr);
        printArr(arr);
    }

}
