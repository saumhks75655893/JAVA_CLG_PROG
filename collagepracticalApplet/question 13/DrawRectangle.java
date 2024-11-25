import java.awt.*;
import javax.swing.*;

public class DrawRectangle extends JApplet {
    public void init() {
        setSize(200, 200);
        repaint();
    }

    public void paint(Graphics g)
	{
		// set Color for rectangle
		g.setColor(Color.green);

		// draw a ellipse
		g.drawRect(10, 10, 150, 100);
	}
}