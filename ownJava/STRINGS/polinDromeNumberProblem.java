package STRINGS;
import java.util.*;
public class polinDromeNumberProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abcdcba";
//        first method
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        String s1 = sb + "";
//        if(s.equals(s1))
//        {
//            System.out.println("polindrome number");
//        }
//        else{
//            System.out.println("not a polindrome number");
//        }

//        second method

        int i=0;
        int j = s.length()-1;
        boolean flag = true;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if(flag==true){
            System.out.println("a Polindrome");
        }else{
            System.out.println("not a polindrome");
        }

    }
}
