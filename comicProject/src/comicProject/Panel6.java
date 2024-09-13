package comicProject;

import javax.swing.*;
import java.awt.*;

public class Panel6 extends JPanel {
	
	public Panel6(Color bk) {
		setBackground(bk);
		
	}

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(Color.green);
		g.drawOval(200, 200, 50, 50);
		g.drawString("Man turns into a horse and says Dang I am thirsty", 30, 30);
		
	}
	
	
}
