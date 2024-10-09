package STRINGS;
import java.util.*;
public class EqualsMethodAndEqualOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello";
        String str1 = "Hello";
        String str2 = new String("Hello");
        //str1==str2
        System.out.println(str == str1);    // true
        System.out.println(str == str2);    // false
        // str.equals();
        System.out.println(str.equals(str1));
        System.out.println(str.equals(str2));
    }
}
