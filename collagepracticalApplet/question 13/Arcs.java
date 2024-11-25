import java.awt.*;
import javax.swing.*;

public class Arcs extends JApplet {
    public void init() {
        setSize(200, 200);
        repaint();
    }
    public void paint(Graphics g)
	{
		// set Color for rectangle
		g.setColor(Color.green);

		// draw a ellipse
		g.drawArc(10,10,150,150,150,360);
	}
}
