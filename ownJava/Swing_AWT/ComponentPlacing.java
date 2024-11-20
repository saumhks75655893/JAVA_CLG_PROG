package JAVA_CLG_PROG.ownJava.Swing_AWT;
import java.awt.*;
public class ComponentPlacing {
    Frame f;
    Label l;
    TextField tf;
    Button b1;

    ComponentPlacing(String S)
    {
        f = new Frame(S);
        l = new Label("Enter You Name : ");
        l.setBounds(40,40,100,20);
        f.add(l);

        tf = new TextField();
        tf.setBounds(160,40,200,30);
        f.add(tf);

        b1 = new Button("OK");
        b1.setBounds(140,100,100,40);
        f.add(b1);

        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ComponentPlacing("Component Placing");
    }
}
