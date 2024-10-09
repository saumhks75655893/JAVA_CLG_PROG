import java.util.Scanner;

public class AddTwoNumber {
    // add two numbers 
    public static int addTwoNumberFunction(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // multiply two number
    public static int calculateProduct(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a : ");
        int a = sc.nextInt();
        System.out.print("b : ");
        int b = sc.nextInt();

        // System.out.println("sum is : " + addTwoNumberFunction(a,b)); 
        System.out.println("Product of " + a + "and " + b + " is " + " :   " + calculateProduct(a, b));
    }
}
