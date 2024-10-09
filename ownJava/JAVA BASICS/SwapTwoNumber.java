import java.util.Scanner;
// swap two number 

class SwapTwoNumbers {
    int a;
    int b;

    public void show() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        a = sc.nextInt();
        System.out.println("Enter second number : ");
        b = sc.nextInt();


        System.out.println();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println();
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}

public class SwapTwoNumber {
    public static void main(String[] args) {
        SwapTwoNumbers swap = new SwapTwoNumbers();
        swap.show();
    }
}
