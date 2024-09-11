import java.util.*;

// write a code to find out that the given number is a odd or even number.
class EvenOddNumber {
    int x;

    public void evenOddNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you number : ");
        x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println(x + " is even!!");
        } else {
            System.out.println(x + " is odd !! ");
        }
    }
}

// Write a code to find out between two number, which is greater, lesser or equal to each other. 

class SmallerGreaterEqualNumber
{
    int a; 
    int b; 

    public void display()
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter number 1 : ");
        a = sc.nextInt(); 
        System.out.println("Enter second number : ");
        b = sc.nextInt(); 

        if(a>b )
        {
            System.out.println(a + " is greater than " + b);
        }
        else if(a == b)
        {
            System.out.println(a + " is equal to " + b);
        }
        else
        {
            System.out.println(a + " is smaller than " + b);
        }
    }
}
public class OddEven {
    public static void main(String[] args) {
        EvenOddNumber num1 = new EvenOddNumber(); 
        // num1.evenOddNumber();


        SmallerGreaterEqualNumber num = new SmallerGreaterEqualNumber(); 
        num.display();
    }

}
