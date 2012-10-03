import javax.swing.JFrame;

public class Lab7ExtraCreditTest {
	
	public static void main (String[] args) {
		
		Lab7ExtraCredit panel = new Lab7ExtraCredit();
		
		JFrame application = new JFrame();
		
		//application.setDefaultCloseOperator(JFrame.EXIT_ON_CLOSE);
		
		application.add( panel );
		application.setSize(275, 275);
		application.setVisible(true);
		
	}
}
