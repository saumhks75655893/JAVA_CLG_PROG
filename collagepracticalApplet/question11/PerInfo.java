import java.applet.Applet;
import java.awt.Graphics;

public class PerInfo extends Applet {
    // Overriding paint() method
	@Override
	public void paint(Graphics g) 
	{
		g.drawString("Name :  Himanshu kumar", 20, 20);
		g.drawString("Address : Vill-Rammando, Post-Bhatraul,Chakia, Chandauli, UP", 20, 40);
		g.drawString("Qualification: 10th, 12th, Pursing BCA", 20, 60);
	}
	
}

