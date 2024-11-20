package JAVA_CLG_PROG.CollageJavaPractical;

public class OddEvenInArrayExample {
    public static void main(String[] args) {
        int a[] = {1,2,5,6,3,12};
        System.out.println("Odd Numbers : ");
        for(int i=0; i<a.length; i++)
        {
            if(a[i] % 2 != 0)
            {
                System.out.print(" "+a[i]);
            }
        }
        System.out.println();
        System.out.println("Even numbers : ");
        for(int i=0; i<a.length; i++)
        {
            if(a[i] %2 == 0)
            {
                System.out.print(" "+a[i]);
            }
        }
    }
}
