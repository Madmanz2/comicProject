package comicProject;

import javax.swing.*;
import java.awt.*;

public class Panel5 extends JPanel {

	public Panel5(Color bk) {
		setBackground(bk);
		
	}

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(Color.black);
		
		g.drawString("Man takes his medication", 30, 50);
		
		
		//main character
				g.setColor(new Color(238,207,180));
				g.fillOval(200, 100, 100, 100);
				g.setColor(Color.blue);
				g.drawLine(250, 200, 250, 350);
				g.setColor(new Color(238,207,180));
				g.drawLine(250, 225, 275, 200);
				g.drawLine(250, 225, 230, 250);
				g.setColor(new Color(0,0,0));
				
				g.fillOval(275, 125, 10, 10);
				g.fillOval(250, 125, 10, 10);
				
		//med
				g.setColor(Color.white);
				g.fillOval(275, 200, 5, 5);
		
		
		
	}
	
	
}
