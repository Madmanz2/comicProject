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
		g.drawOval(200, 200, 50, 50);
		g.drawString("Doc is she going to make it??", 30, 30);
		g.drawString("We can't say at this time", 100, 50);
		
	}
	
	
}