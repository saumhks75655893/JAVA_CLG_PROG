package ownJava.STRINGS;

import java.util.Scanner;

public class SubStringPolinDromeProblem {
    public static boolean polindromeSubstring(String s) {
        int i = 0;
        int j = s.length() - 1;
        boolean flag = true;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
//        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abcde";
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (polindromeSubstring(s.substring(i, j))) {
                    System.out.println(s.substring(i, j));
                }
            }
        }
        System.out.println("These substrings are polindrome strings.");
    }
}
