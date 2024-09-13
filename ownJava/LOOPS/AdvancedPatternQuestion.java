
// Advanced Questions 
import java.util.*;
//  patter 1 :  Butterfly pattern 
/*
*        *
**     **
***  ***
*******
***  ***
**     **
*        *
 */

class Pattern1 {
    public void display() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (2 * (n - i)); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        // next part
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (2 * (n - i)); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

// pattern 2 : Solid Rhombus
/*
     ******
    ******
   ******
  ******
 ******
 */
class Pattern2 {
    public void display() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

// pattern 3 : Hollow Rhombus
/*
 ******
 * *
 * *
 * *
 ******
 */
class Pattern3 {
    public void display() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if ((i == n) || (i == 1) || (j == n) || (j == 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}

// pattern 4 : Number Piramid
/*
    1 
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
 */
class Pattern4 {
    public void display() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for(int j=1; j<=(n-i); j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}

// pattern 4 : Palindromic pattern
/*
        1    
      212   
    32123  
  4321234 
543212345
 */
class Pattern5 {
    public void display() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for(int j=1; j<=(n-i); j++)
            {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j );
            }
            for(int j=2; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
// pattern 5 : Diamond pattern
/*
   *
 ***
*****
*****
 ***
  *
 */
class Pattern6 {
    public void display() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        n = sc.nextInt();
        // upper part
        for (int i = 1; i <= n; i++) {
            for(int j=1; j<=(n-i); j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j<=(2*i-1); j++) {
                System.out.print("*");
            }
        
            System.out.println();
        }
        // lower part
        for (int i = n; i >=1; i--) {
            for(int j=1; j<=(n-i); j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j<=(2*i-1); j++) {
                System.out.print("*");
            }
        
            System.out.println();
        }

    }
}

// calling class
public class AdvancedPatternQuestion {
    // main method
    public static void main(String[] args) {

        // Pattern1 p1 = new Pattern1();
        // p1.display();

        // Pattern2 p2 = new Pattern2();
        // p2.display();

        // Pattern3 p3 = new Pattern3();
        // p3.display();

        // Pattern4 p4 = new Pattern4();
        // p4.display();

        // Pattern5 p5 = new Pattern5();
        // p5.display();

        Pattern6 p6 = new Pattern6();
        p6.display();
    }
}
