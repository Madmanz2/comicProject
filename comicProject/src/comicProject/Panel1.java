package comicProject;

import javax.swing.*;
import java.awt.*;

public class Panel1 extends JPanel {
	
	public Panel1(Color bk) {
		setBackground(bk);
		
	}

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(new Color(238,207,180));
		//g.drawOval(250, 100, 50, 50);
		g.fillOval(275, 100, 100, 100);
		
		//sets new font
		g.setColor(Color.black);
		Font f = new Font("Helvetica", Font.PLAIN, 35);
		g.setFont(f);
		g.drawString("Arives at Emergency Room", 75, 40);
		g.setColor(Color.blue);
		g.drawLine(325, 200, 325, 350);
		g.setColor(new Color(238,207,180));
		g.drawLine(325, 225, 350, 250);
		g.drawLine(325, 225, 275, 200);
		g.setColor(new Color(0,0,0));
		g.fillOval(350, 125, 10, 10);
		g.fillOval(325, 125, 10, 10);
		
		//doors 
		g.drawLine(200, 500, 200, 50);
		g.drawLine(500, 500, 500, 50);
		g.drawLine(200, 50, 500, 50);
	}
	
	
}
