package comicProject;

import javax.swing.*;
import java.awt.*;

public class Panel4 extends JPanel {
	
	public Panel4(Color bk) {
		setBackground(bk);
		
	}

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(Color.black);
		g.drawString("wife :(", 100, 75);
		
		//main character
				g.setColor(new Color(238,207,180));
				g.fillOval(150, 100, 100, 100);
				g.setColor(Color.blue);
				g.drawLine(200, 200, 200, 350);
				g.setColor(new Color(238,207,180));
				g.drawLine(200, 225, 225, 250);
				g.drawLine(200, 225, 180, 250);
				g.setColor(new Color(0,0,0));
				
				g.fillOval(225, 125, 10, 10);
				g.fillOval(200, 125, 10, 10);
				
		//bed
				g.setColor(Color.black);
				g.drawLine(350, 500, 350, 215);
				g.drawLine(350, 215, 700, 215);
		//wife
				g.setColor(new Color(238,207,180));
				g.fillOval(475, 150, 100, 100);
				g.setColor(Color.black);
				g.fillOval(525, 175, 10, 10);
				g.fillOval(525, 200, 10, 10);
				g.setColor(Color.pink);
				g.drawLine(375, 200, 475, 200);
				
				
				
		
	}
	
	
}
