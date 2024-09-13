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
		g.drawOval(200, 200, 50, 50);
		g.drawString("Where is my wife??", 30, 30);
		g.drawString("She is in the room over there", 100, 50);
		
	}
	
	
}
