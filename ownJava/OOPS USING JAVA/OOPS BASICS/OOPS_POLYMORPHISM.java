// Polymorphism : poly - many names ,morphims - working different


class shape {
    String shape;

    public void ShapeIs(String shape) {
        System.out.println("Shape is " + shape);
    }
}

class Triangle extends shape {
    int a, b, c;

    public void AreaIs(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

        int area = a * b * c;
        System.out.println("Area is " + area);
    }
}

public class OOPS_POLYMORPHISM {
    public static void main(String[] args) {

        System.out.println("Polymorphism !!!! ");

        Triangle t1 = new Triangle();
        t1.ShapeIs("triangle");
        t1.AreaIs(10, 20, 30);
    }
}
