import java.awt.Component;

import javax.swing.JFrame;

public class Lab06Test {

	public static void main (String[] args){
		
		Lab06 panel = new Lab06();
		
		JFrame application = new JFrame();
		
		//application.setDefaultCloseOperator(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel);
		application.setSize(500, 500);
		application.setVisible(true);
		
	}
	
}
