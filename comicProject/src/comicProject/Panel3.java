package comicProject;

import javax.swing.*;
import java.awt.*;

public class Panel3 extends JPanel {
	
	public Panel3(Color bk) {
		setBackground(bk);
		
	}

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(Color.black);
		g.drawString("Is she going to make it doc?", 50, 75);
		g.drawString("Sorry but we don't know for sure at this time", 300, 75);
		
		
		//main character
		g.setColor(new Color(238,207,180));
		g.fillOval(200, 100, 100, 100);
		g.setColor(Color.blue);
		g.drawLine(250, 200, 250, 350);
		g.setColor(new Color(238,207,180));
		g.drawLine(250, 225, 275, 250);
		g.drawLine(250, 225, 230, 250);
		g.setColor(new Color(0,0,0));
		
		g.fillOval(275, 125, 10, 10);
		g.fillOval(250, 125, 10, 10);
		
		//doc
		g.setColor(new Color(238,207,180));
		g.fillOval(400, 100, 100, 100);
		g.setColor(Color.white);
		g.drawLine(450, 200, 450, 350);
		g.setColor(new Color(238,207,180));
		g.drawLine(450, 225, 475, 250);
		g.drawLine(450, 225, 400, 200);
		g.setColor(new Color(0,0,0));
		g.fillOval(425, 125, 10, 10);
		g.fillOval(450, 125, 10, 10);
		g.fillRect(400, 100, 100, 25);
	}
	
	
}