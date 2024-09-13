package comicProject;

import javax.swing.*;
import java.awt.*;

public class Panel1 extends JPanel {
	
	public Panel1(Color bk) {
		setBackground(bk);
		
	}

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(Color.black);
		g.drawOval(250, 100, 50, 50);
		g.drawString("Panel1", 30, 30);
		g.drawLine(275, 150, 275, 200);
	}
	
	
}
