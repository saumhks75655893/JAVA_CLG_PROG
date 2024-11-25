package JAVA_CLG_PROG.CollageJavaPractical;

import java.lang.Math;

class AreaOfCircleRactangleCylinder {
    static final double PI = Math.PI;

    //    Area of the circle
    void Area(double r) {
        double areaOfCircle = PI * r * r;
        System.out.println("Area of circle is : "+areaOfCircle);
    }

    //    Area of the ractangle
    void Area(double length, double width) {
        double areaOfRactangle = length * width;
        System.out.println("The area fo the Ractangle is : "+areaOfRactangle+ " square units");
    }

    //    Area fo the Cylinder
    void AreaOfCylinder(double r, double height) {
        double areaOfCylinder = 2 * PI * r * (r + height);
        System.out.println("The area of the cyclinder is : "+ areaOfCylinder+ " square units");

    }
    void AreaOfCylinder(int r, int height) {
        double areaOfCylinder = 2 * PI * r * (r + height);
        System.out.println("The area of the cyclinder is : "+ areaOfCylinder+ " square units");

    }

}

public class AreaOfCircleRactangleAndCylinder{

    public static void main(String[] args) {
        AreaOfCircleRactangleCylinder ar = new AreaOfCircleRactangleCylinder();
        ar.Area(10.3);
        ar.Area(9.7,40.3);
        ar.AreaOfCylinder(40 ,50);
        ar.AreaOfCylinder(10.3, 40.5);
    }
}
