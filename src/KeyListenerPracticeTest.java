import javax.swing.*;

public class KeyListenerPracticeTest {

	public static void main (String [] args) {

		JFrame frame = new JFrame ();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new KeyListenerPractice());

		frame.pack();
		frame.setVisible(true);
		frame.setSize(400, 400);
	}
}