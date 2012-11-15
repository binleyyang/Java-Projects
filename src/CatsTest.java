import javax.swing.JFrame;

public class CatsTest {
	
	public static void main (String[] args) {
		
		Cats frame = new Cats();//this creates the LabelFrame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800); // sets the frame size
		frame.setVisible(true); //displays the frame
		
	}
}
