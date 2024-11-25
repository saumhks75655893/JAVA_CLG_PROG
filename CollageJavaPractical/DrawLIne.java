package JAVA_CLG_PROG.CollageJavaPractical;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

class MyCanvas extends JComponent{
    public void paint(Graphics g){
        g.drawLine(30,20,80,90);
    }
}
public class DrawLIne {
    public static void main(String[] args) {

        // creating object of JFrame(Window popup)
        JFrame window = new JFrame();

        // setting closing operation
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // setting size of the pop window
        window.setBounds(30, 30, 200, 200);

        // setting canvas for draw
        window.getContentPane().add(new MyCanvas());

        // set visibility
        window.setVisible(true);
    }
}
