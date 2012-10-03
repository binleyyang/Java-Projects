import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;

public class Lab06 extends JPanel {
	
	public void paintComponent (Graphics g) {
		
		super.paintComponent(g);
		
		
		int width = getWidth();
		int height = getHeight();
		
		g.setColor(Color.black);
		g.fillRect(100, 100, 250, 250);
		
		g.setColor(Color.white);
		g.fillOval(150, 150, 40, 40);
		
		g.setColor(Color.white);
		g.fillOval(260, 150, 40, 40);
		
		g.setColor(Color.yellow);
		g.fillArc(200, 210, 50, 50, 50, 90);
		
		g.fillOval(170, 240, 120, 60);
		
		g.setColor(Color.black);
		g.fillRect(170, 240, 120, 30);
		g.fillOval(170, 250, 120, 40);
		
		g.drawRect(90, 70, 270, 30);
		
		g.drawLine(225, 100, 50, 50);
		
	}

}
