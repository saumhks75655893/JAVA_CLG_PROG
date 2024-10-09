package STRINGS;
import java.util.*;
public class ProblemsOnStringAndStringBuilder {
    public static void main(String[] args) {
//        p1. -> given a string, the task is to toggle all the characters of the string i.e. to convert Upper case to lower case
//        vice versa.
//        PhysICS  -> pHYSics
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
        //toggel
        // PhysICS -> pHYSics
        for(int i=0; i<sb.length(); i++)
        {
            boolean flag = true;
            char ch = sb.charAt(i);
            if(ch==' ') continue;
            int asci = (int)ch;
            if(asci>=97) flag = false;
            if(flag==true){
                asci += 32;
                char dh = (char)asci;
                sb.setCharAt(i,dh);
            }
            else{
                asci -= 32;
                char dh = (char)asci;
                sb.setCharAt(i,dh);
            }
        }
        System.out.println(sb);
    }
}
