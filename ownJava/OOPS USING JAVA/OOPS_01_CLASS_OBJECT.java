// Just starting from the basic oops. 
// class
class Pen {
    //
    String color;
    String type;

    // method declartion
    public void write() {
        System.out.println("Writing Something !! ");
    }

    // method declartion #2
    public void printColorAndType() {
        System.out.println("Pen color is " + this.color);
        System.out.println("Pen type is " + this.type);
    }
}

// main class
public class OOPS_01_CLASS_OBJECT {
    // main function (method)
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "Red";
        pen2.type = "ballpoint";

        // caling from printColorAndType function using objects pen1 and pen2
        pen1.printColorAndType();
        System.out.println();
        pen2.printColorAndType();
    }
}
