import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Lab20JFileTest {

	public static void main (String[] args) throws IOException {
		
		Lab20JFile application = new Lab20JFile();
		
		application.readFile();
		
		//application.setDefaulCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
