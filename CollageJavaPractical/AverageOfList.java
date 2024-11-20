package JAVA_CLG_PROG.CollageJavaPractical;

import java.util.*;

public class AverageOfList {
    public static void main(String[] args) {
        float sum = 0;
        float avg;
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(34);
        list.add(10);
        list.add(48);
        list.add(65);

        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        avg = sum / list.size();
        System.out.print("The elements is greater than "+avg+" is : ");
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i) > avg)
            {
                System.out.print(list.get(i)+" ");
            }
        }
    }
}
