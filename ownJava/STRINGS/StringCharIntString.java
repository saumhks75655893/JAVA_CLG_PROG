package STRINGS;

import java.util.Scanner;

public class StringCharIntString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abc";
        s += "xyz";
        s += 'r';
        s += 10;
        System.out.println(s);
        System.out.println(10+30+"jay");
        System.out.println("jay" +10 + 20);
    }
}
