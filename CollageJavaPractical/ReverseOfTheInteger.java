package JAVA_CLG_PROG.CollageJavaPractical;

import java.util.Scanner;

public class ReverseOfTheInteger {

    public static int ReverseNumber(int number) {
        int revNum = 0;
        while (number > 0) {
            int digit = number % 10;
            revNum = (revNum * 10) + digit;
            number = number / 10;
        }
        return revNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        System.out.println("Reversed number : " + ReverseNumber(number));
    }
}
