package JAVA_CLG_PROG.ownJava.SWING;

import javax.swing.*;
import java.awt.*;

public class javaSwingButtonExample2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton okbutton = new JButton();
        JButton canclebutton = new JButton();
        okbutton.setBounds(100, 400, 120,50 );
        okbutton.setBackground(Color.black);
        okbutton.setText("Ok");
        canclebutton.setBounds(250, 400, 120,50);
        canclebutton.setBackground(Color.red);
        canclebutton.setText("Cancel");
        frame.add(okbutton);
        frame.add(canclebutton);
        frame.setBounds(200,50,500, 600);
        frame.setTitle("OkAndCancelButton");
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
