package ownJava.OOPS.INHERITANCE;

import java.util.Scanner;

class A1 {
    int a;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        a = sc.nextInt();
    }
}

class B1 extends A1 {
    int b;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a second number : ");
        b = sc.nextInt();
    }
}

class C extends B1 {
    int c = 20;

    void add() {
        System.out.println("Addition : " + (a + b + c));
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        C c = new C();
        c.input();
        c.getdata();
        c.add();
    }
}
