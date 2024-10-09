class ParentClass {
    public void display() {
        System.out.println("This is parent class method !!!! ");
    }
}

class ChildClass extends ParentClass {
    public void show() {
        System.out.println("This child class method !!!! ");
    }
}

public class INHERITANCE_01 {
    public static void main(String[] args) {
        ChildClass c1 = new ChildClass();
        c1.show();
        System.out.println();
        c1.display();
    }
}
