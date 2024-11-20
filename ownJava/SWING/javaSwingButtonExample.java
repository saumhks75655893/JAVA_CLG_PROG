package JAVA_CLG_PROG.ownJava.SWING;

import javax.swing.*;

public class javaSwingButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton();
        button.setBounds(150,200,150,50);
        frame.add(button);
        frame.setBounds(200,70,500,600);
        frame.setTitle("IGNTU");
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
