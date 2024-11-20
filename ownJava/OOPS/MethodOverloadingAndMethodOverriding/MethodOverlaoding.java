package ownJava.OOPS.MethodOverloadingAndMethodOverriding;

public class MethodOverlaoding {


    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static String sum(String s1, String s2) {
        return s1 + s2;
    }

    public static void main(String[] args) {
        System.out.println(sum(10,50));
        System.out.println(sum(10,50,100));
        System.out.println( sum("Himanshu ","kumar"));
    }


}
