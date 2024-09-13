package comicProject;



import java.awt.*;
import javax.swing.*;

public class comicMain {

	public static void main(String[] args) {
		//comment
		JFrame maddox = new JFrame();
		maddox.setTitle("Loss Comic Extened");
		//Screen Size
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int height = screenSize.height;
		int width = screenSize.width;
		
		maddox.setPreferredSize(new Dimension(width,height));
		maddox.pack();
		maddox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Panel1 p1 = new Panel1(new Color(100,100,100));
		Panel2 p2 = new Panel2(new Color(65,65,65));
		Panel3 p3= new Panel3(new Color(100,100,100));
		Panel4 p4 = new Panel4(new Color(65,65,65));
		Panel5 p5 = new Panel5(new Color(100,100,100));
		Panel6 p6 = new Panel6(new Color(65,65,65));
		
		Container pane = maddox.getContentPane();
		pane.setLayout(new GridLayout(3,2, 25, 25));
		//1
		//row 1
		pane.add(p1); pane.add(p2);
		
		//row 2
		
		pane.add(p3); pane.add(p4);
		
		//row 3
		pane.add(p5); pane.add(p6);
		
		
		maddox.setVisible(true);
		
	}

}
