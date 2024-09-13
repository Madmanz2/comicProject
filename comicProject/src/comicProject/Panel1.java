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
		g.drawLine(325, 150, 325, 350);
	}
	
	
}
