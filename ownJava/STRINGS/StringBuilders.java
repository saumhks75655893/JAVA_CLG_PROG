package STRINGS;
import java.util.*;

public class StringBuilders {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        //stringbuilders initialization
////        StringBuilder s2 = new StringBuilder(100);
//        StringBuilder s1 = new StringBuilder("Hello");
//        System.out.println(s1);
////        hello -> mello
//
////        1. setCharAt(idx, ch)    and append(ch)
//        s1.setCharAt(0,'M');
//        System.out.println(s1);
//        s1.append("Hi");
//        System.out.println(s1);
//
////        2. insert(idx, ch)     and     deleteCharAt(idx)
//        s1.insert(2,'y');
//        System.out.println(s1);
//        s1.deleteCharAt(5);
//        System.out.println(s1);

        StringBuilder sb = new StringBuilder("Physics");
        System.out.println(sb);
//        reverse()         and         delete(i,j)
        System.out.println(sb.reverse());
        System.out.println(sb.reverse());
        System.out.println(sb.delete(2,4));
    }
}
