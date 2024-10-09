import java.util.Scanner;

public class Factorial {
    // factorial of given number
    public static void printFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid number ");
            return;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + ":  " + factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number  : ");
        int a = sc.nextInt();
        printFactorial(a);

    }
}
