package comicProject;

import javax.swing.*;
import java.awt.*;

public class Panel2 extends JPanel {
	
	public Panel2(Color bk) {
		setBackground(bk);
		
	}

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(Color.black);
		
		g.drawString("Where is my wife??", 100, 100);
		g.drawString("She is in the room over there", 400, 100);
		
		//main character 
		g.setColor(new Color(238,207,180));
		g.fillOval(200, 100, 100, 100);
		g.setColor(Color.blue);
		g.drawLine(250, 200, 250, 350);
		g.setColor(new Color(238,207,180));
		g.drawLine(250, 225, 275, 250);
		g.drawLine(250, 225, 200, 200);
		g.setColor(new Color(0,0,0));
		
		g.fillOval(275, 125, 10, 10);
		g.fillOval(250, 125, 10, 10);
		
		
		//desk
		g.drawLine(550, 500, 400, 200);
		g.drawLine(400, 200, 800, 200);
		g.drawLine(400, 200, 400, 500);
		
		//women
		g.setColor(new Color(238,207,180));
		g.fillOval(450, 150, 75, 75);
		g.drawLine(485, 250, 400, 225);
		g.setColor(Color.pink);
		g.drawLine(485, 225, 485, 500);
		g.setColor(new Color(176, 101, 0));
		g.fillOval(460, 150, 65, 65);
		g.fillRect(500, 200, 10, 200);
		g.setColor(new Color(0,0,0));
		g.fillOval(450, 175, 10, 10);
		
	}
	
	
}
