import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;

public class SpellsPanel extends JPanel{

	public SpellsPanel() {
		
		setLayout (new FlowLayout());
		setBackground (Color.blue);
		
		JButton b1 = new JButton ("Fire Attack");
		JButton b2 = new JButton ("Water Attack");
		JButton b3 = new JButton ("Wind Attack");
		JButton b4 = new JButton ("Earth Attack");
		JButton b5 = new JButton ("Ice Attack");
		
		add (b1);
		add (b2);
		add (b3);
		add (b4);
		add (b5);
	}
}
