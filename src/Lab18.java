import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Lab18 {

	public static void main (String [] args) {

		JFrame frame = new JFrame ("Decimal to Binary Converter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTabbedPane tab = new JTabbedPane();

		tab.addTab("Converter", new Lab18Panel());

		frame.getContentPane().add(tab);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(800, 800);
	}
}