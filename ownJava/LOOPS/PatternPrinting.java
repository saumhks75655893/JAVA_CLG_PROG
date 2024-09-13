import java.util.*;

// pattern1
/*
 * *****
 * *****
 * *****
 * *****
 */
class Pattern1 {
    public void display() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Patter 2
/*
 * ******
 * * *
 * * *
 * ******
 */

class Pattern2 {
    int n;
    int m;

    public void display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        n = sc.nextInt();
        System.out.println("Enter m:");
        m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if ((i == 1) || (i == n) || (j == 1) || (j == m)) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



// patter 3 
/*
 * *
 * **
 * ***
 * ****
 */

 class Pattern3
 {
    public void display()
    {
        int n; 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter your number : ");
        n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
 }

//  patter 4 : half inverse triangle  
 /*
  *****
  ****
  ***
  **
  *
  */
 
  class Pattern4 
  {
     public void display()
     {
         int n; 
         Scanner sc = new Scanner(System.in); 
         System.out.println("Enter your number : ");
         n = sc.nextInt();
         for(int i=n; i>=1; i--)
         {
             for(int j=1; j<=i; j++)
             {
                 System.out.print("*");
             }
             System.out.println();
         }
     }
  }

//   Pattern 5 : half rounded piramid
/*
    *
  **
 ***
****
 */
class Pattern5
{
   public void display()
   {
       int n; 
       Scanner sc = new Scanner(System.in); 
       System.out.println("Enter your number : ");
       n = sc.nextInt();
       for(int i=1; i<=n; i++)
       {
           for(int j=1; j<=(n-i); j++)
           {
               System.out.print(" ");
           }
           for(int j=1; j<=i; j++)
           {
            System.out.print("*");
           }
           System.out.println();
       }
   }
}

// patter 6
/*
1
12
123
1234
 */

 class Pattern6
 {
    public void display()
    {
        int n; 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter your number : ");
        n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
 }

 //  patter 7 : 
 /*
  12345
  1234
  123
  12
  1
  */
 
  class Pattern7
  {
     public void display()
     {
         int n; 
         Scanner sc = new Scanner(System.in); 
         System.out.println("Enter your number : ");
         n = sc.nextInt();
         for(int i=n; i>=1; i--)
         {
             for(int j=1; j<=i; j++)
             {
                 System.out.print(j);
             }
             System.out.println();
         }
     }
  }
  //  patter 8 : Flyod's triangle 
  /*
 1
 23
 456
 78910
 11121314
   */
  
   class Pattern8
   {
      public void display()
      {
          int n; 
          int number=1; 
          Scanner sc = new Scanner(System.in); 
          System.out.println("Enter your number : ");
          n = sc.nextInt();
          for(int i=1; i<=n; i++)
          {
              for(int j=1; j<=i; j++)
              {
                  System.out.print(number);
                  number++; 
              }
              System.out.println();
          }
      }
   }
  //  patter 9 : 0-1 triangle 
  /*
 1
01
101
0101
10101
   */
  
   class Pattern9
   {
      public void display()
      {
          int n; 
          
          Scanner sc = new Scanner(System.in); 
          System.out.println("Enter your number : ");
          n = sc.nextInt();
          for(int i=1; i<=n; i++)
          {
              for(int j=1; j<=i; j++)
              {
                  if((i+j) % 2 == 0 )
                  {
                    System.out.print("1 ");
                  }
                  else
                  {
                    System.out.print("0 ");
                  }
              }
              System.out.println();
          }
      }
   }
  

public class PatternPrinting {
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

        // Pattern6 p6 = new Pattern6();
        // p6.display();

        // Pattern7 p7 = new Pattern7();
        // p7.display();

        // Pattern8 p8 = new Pattern8();
        // p8.display();

        Pattern9 p9 = new Pattern9();
        p9.display();
    }
}
