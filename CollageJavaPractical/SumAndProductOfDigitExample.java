package JAVA_CLG_PROG.CollageJavaPractical;

import java.util.Scanner;

public class SumAndProductOfDigitExample {

    public static int sumOfDigit(int number) {
        int sum = 0;
        while (number > 0) {

            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }
    public static int productOfDigit(int number)
    {
        int mul = 1;
        while(number > 0)
        {
            int digit = number % 10;
            mul = mul * digit;
            number = number / 10;
        }
        return mul;
    }

    public static void main(String[] args) {
        int number, sum, mul;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        number = sc.nextInt();
        sum = sumOfDigit(number);
        System.out.println("Sum of the Digits : " + sum);
        mul = productOfDigit(number);
        System.out.println("Product of the Digits : " + mul);

    }
}
