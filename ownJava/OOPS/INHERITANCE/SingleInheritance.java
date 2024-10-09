package ownJava.OOPS.INHERITANCE;

import java.util.Scanner;

class A {
    int a, b;

    void input() {

        Scanner sc = new Scanner(System.in);
        System.out.print("a : ");
        a = sc.nextInt();
        System.out.print("b : ");
        b = sc.nextInt();
    }
    void add()
    {
        System.out.println("Addition : "+(a+b));
    }

}
class B extends A {
    int c;
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("c : ");
        c = sc.nextInt();
    }
    void display()
    {
        System.out.print("Addition : "+(a+b+c));
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.input();
        obj.add();
        obj.getdata();
        obj.display();
    }
}
