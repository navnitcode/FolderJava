import java.util.*;

// public class ArrayCC {
//     public static void main(String[] args) {
//         int marks[] = new int[49];

//         Scanner sc = new Scanner(System.in);
//         marks[0] = sc.nextInt();
//         marks[1] = sc.nextInt();
//         marks[2] = sc.nextInt();

//         System.out.println("physics " + marks[0]);
//         System.out.println("maths " + marks[1]);
//         System.out.println("chemistry " + marks[2]);

//         marks[2] = 100;
//         System.out.println("chemistry " + marks[2]);

//         System.out.println(marks.length);

//     }
// }

// public class ArrayCC {

//     public static int linerSearch(int number[], int key) {
//         for (int i = 0; i < number.length; i++) {
//             if (number[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String args[]) {
//         int number[] = { 1, 2, 5, 22, 43 };
//         int key = 10;

//         int index = linerSearch(number, key);
//         if (index != -1) {
//             System.out.println("Element found at index " + index);
//         } else {
//             System.out.println("Element not found in array");
//         }

//         System.out.println();
//     }

// }

public class ArrayCC {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String nk = sc.nextLine();

        int n = sc.nextInt();

        int sum = 0;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            rev = rev * 10 + digit;

            n = n / 10;
        }
        System.out.println("sum is " + nk + sum);
        System.out.println("rev is " + rev);

    }
}