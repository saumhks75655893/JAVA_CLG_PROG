package STRINGS;
import java.util.*;
public class SubStrings {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = "abcde";
//        System.out.println(s.substring(0,3));
//        System.out.println(s.substring(2,5));
//        System.out.println(s.substring(1));
//
//        String str1 = "physics";
//        for(int i=2; i<4; i++){
//            System.out.println(str1.substring(i));
//        }
//        System.out.println();

        String str2 = "abcd";
        System.out.println(str2.length()-1);
        System.out.println(str2.length()+1);
        for (int i = 0; i <= str2.length()-1; i++) {
            for (int j = i+1; j <= str2.length(); j++) {
                System.out.print(str2.substring(i, j)+ " ");
            }
        }
    }
}

