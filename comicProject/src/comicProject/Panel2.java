package comicProject;

import javax.swing.*;
import java.awt.*;

public class Panel2 extends JPanel {
	
	public Panel2(Color bk) {
		setBackground(bk);
		
	}

	public void paintComponet(Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(Color.cyan);
		g.drawOval(200, 200, 50, 50);
		g.drawString("Panel1", 30, 30);
		
	}
	
	
}
