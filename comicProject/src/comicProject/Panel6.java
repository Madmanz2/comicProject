package comicProject;

import javax.swing.*;
import java.awt.*;

public class Panel6 extends JPanel {
	
	public Panel6(Color bk) {
		setBackground(bk);
		
	}

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(Color.black);
		
		g.drawString("*Turns into a horse*   Dang I am thirsty", 30, 30);
		
		g.setColor(new Color(139,69,19));
		g.fillOval(200, 125, 200, 100);
		g.fillRect(235, 200, 20, 100);
		g.fillRect(350, 200, 20, 100);
		g.fillRect(350, 100, 20, 100);
		g.fillOval(340, 50, 100, 75);
		g.fillOval(415, 80, 50, 35);
		g.setColor(Color.black);
		g.fillOval(400, 75, 10, 10);
		g.fillOval(425, 75, 10, 10);
		g.fillOval(450, 85, 10, 10);
		
	}
	
	
}
