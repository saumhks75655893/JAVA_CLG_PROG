
import java.awt.*;
import javax.swing.*;

public class Circles extends JApplet {
    public void init() {
        setSize(200, 200);
        repaint();
    }

    public void paint(Graphics g)
	{
		// set Color for rectangle
		g.setColor(Color.green);

		// draw a ellipse
		g.drawOval(10, 10, 150, 150);
	}
}