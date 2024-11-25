package JAVA_CLG_PROG.CollageJavaPractical;

interface AreaOfRectangle{
    void RectangleArea(double width, double height);
}
interface AreaOfTriangle{
    void TriangleArea(double base, double height);
}

class AreaOfRectangleAndTriangle implements AreaOfRectangle, AreaOfTriangle{
    @Override
    public void RectangleArea(double width, double height) {
         double area = width * height ;
        System.out.println("Area of the rectangle is : "+area+" square units");
    }

    @Override
    public void TriangleArea(double base, double height) {
        double area = (base * height) / 2;
        System.out.println("Area of the triangle is : "+area+" square units");
    }
}
public class AreaOfRacatangleAndTriangleUsingMultipleInheritanceUsingInterface {
    public static void main(String[] args) {
        AreaOfRectangleAndTriangle ar = new AreaOfRectangleAndTriangle();
        ar.RectangleArea(15.2, 17.8);
        ar.TriangleArea(5.3, 10.3);
    }
}
