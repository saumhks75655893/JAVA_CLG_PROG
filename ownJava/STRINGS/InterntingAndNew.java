package STRINGS;
import java.util.*;

public class InterntingAndNew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = "Hello";
//        String gtr = "Hello";
//        gtr = "Mello";
//        System.out.println(gtr);
//        System.out.println(str);
//
//        String str1 = new String("Hello");
//        System.out.println(str1);

        // immutability in string
        String str = "Hello";  // -> "Heylo"
        str = str.substring(0,2) + 'y' + str.substring(3);
        System.out.println(str);

    }
}
