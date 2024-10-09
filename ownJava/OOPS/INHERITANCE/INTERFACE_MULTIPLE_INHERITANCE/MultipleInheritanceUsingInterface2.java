package ownJava.OOPS.INHERITANCE.INTERFACE_MULTIPLE_INHERITANCE;
interface A{
    public void run();
}
interface B{
    public void run1();
}

class C implements A,B{
    public void run(){
        System.out.println("Run C from A");
    }
    public void run1(){
        System.out.println("Run C from B");
    }
}
public class MultipleInheritanceUsingInterface2 {
    public static void main(String[] args) {
        C c = new C();
        c.run();
        c.run1();
    }
}
