package comicProject;

import javax.swing.*;
import java.awt.*;

public class Panel6 extends JPanel {
	
	public Panel6(Color bk) {
		setBackground(bk);
		
	}

	public void paintComponet(Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(Color.green);
		g.drawOval(200, 200, 50, 50);
		g.drawString("Panel6", 30, 30);
		
	}
	
	
}
