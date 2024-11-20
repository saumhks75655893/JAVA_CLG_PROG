package JAVA_CLG_PROG.CollageJavaPractical;

public class FactorialExample {
    public static void main(String[] args) {
        int i, fact=1;
        int numbers = 5;
        for(i=1; i<=numbers; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+numbers +" is : "+fact);
    }
}
