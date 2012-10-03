import java.awt.Graphics;
import javax.swing.JPanel;

public class Lab7ExtraCredit extends JPanel {

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//int width = getWidth();
		//int height = getHeight();
		
		for (int i = 15, j = 225; i <= 225; i += 15, j -= 15) {
			
			g.drawLine(0, 0, j, i);
			g.drawLine(260, 237, j, i);
			
		}

		for (int j = 0, i = 0; j <= 225; j += 15, i += 15) {
			
			g.drawLine(0, 240, j, i);		
			g.drawLine(260, 0, j, i);
			
		}
		
	}
}
