package ownJava.OOPS.INHERITANCE.INTERFACE_MULTIPLE_INHERITANCE;

interface area {
    final static float pi = 3.14f;

    float calculateArea(float x, float y);
}

class Rectangle implements area {
    public float calculateArea(float x, float y) {
        return x * y;
    }
}

class Circle implements area {
    public float calculateArea(float x, float y) {
        return pi * x * x;
    }
}

public class InterfaceBasic {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        area a;
        a = r;
        System.out.println("Area of the rectangle is : "+a.calculateArea(10,20));
        a = c;
        System.out.println("Area of the circle is : "+a.calculateArea(10,20));
    }
}
