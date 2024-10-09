package ownJava.OOPS.INHERITANCE;

class B2 extends  A{
    void add()
    {
        System.out.println("Addition : "+(a+b));
    }
}

class C2 extends A{
    void subs()
    {
        System.out.println("Subtraction : "+(a-b));
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        B2 b = new B2();
        b.input();
        b.add();
        C2 c = new C2();
        c.input();
        c.subs();
    }
}
