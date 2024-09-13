import java.util.*;
//  Exampel 1 : Sum of the n natural numbers. 
class Example1
{
    int n; 
    int sum=0; 
    public void show()
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter your number : ");
        n = sc.nextInt(); 

        for(int i=1; i<=n; i++)
        {
            sum += i; 
        }
        System.out.println("sum is : " + sum);
    }

}

//Example 2 : Print the table of the given number. 
class Table
{
    int n; 
    public void PrintTable()
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter your number : ");
        n = sc.nextInt(); 

        for(int i=1; i<=10; i++)
        {
            System.out.println(n + " x " + i + " - " + (n * i));
        }
    }
}
public class SomeExamples {
    public static void main(String[] args) {
        // Example1 ex1 = new Example1(); 
        // ex1.show();

        Table tl = new Table(); 
        tl.PrintTable();
    }
}
