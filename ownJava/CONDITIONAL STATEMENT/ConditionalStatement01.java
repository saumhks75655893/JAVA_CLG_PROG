import java.util.Scanner;

public class ConditionalStatement01 {
    // if - else statement 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age : ");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Person is adult");
        } else {
            System.out.println("Person is not adult ");
        }
    }
}
