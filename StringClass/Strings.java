package StringClass;

import java.util.*;

public class Strings {

    public static boolean palindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }

        }
        return true;
    }

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);

        // String name;
        // name = sc.nextLine();

        // System.out.println(name);
        // for (int i = 0; i < name.length(); i++) {
        // System.out.println(name.charAt(i));
        // }
        String str = "121";
        System.out.println(palindrome(str));
    }
}
