// Multi Level INheritance 

class A
{
    public void MethodA()
    {
        System.out.println("This is the method A from class A ");
    }
}

class B extends A
{
    public void MethodB()
    {
        System.out.println("This is the method B from class B");
    }
}

class C extends B
{
    public void MethodC()
    {
        System.out.println("This is the Method C from Class C");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        C obj = new C(); 
        obj.MethodC();
        System.out.println();
        obj.MethodB();
        System.out.println();
        obj.MethodA();
    }
}
