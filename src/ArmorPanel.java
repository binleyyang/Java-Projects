import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

public class ArmorPanel extends JPanel {
	
	public ArmorPanel() {
		setLayout(new BorderLayout());
		
		setBackground(Color.orange);
		
		JButton b1 = new JButton ("Shield");
		JButton b2 = new JButton ("Chainmail");
		JButton b3 = new JButton ("Helmet");
		JButton b4 = new JButton ("Boots");
		JButton b5 = new JButton ("Gauntlets");
		
		add (b2, BorderLayout.CENTER);
		add (b3, BorderLayout.NORTH);
		add (b4, BorderLayout.SOUTH);
		add (b5, BorderLayout.EAST);
		add (b1, BorderLayout.WEST);
	}

	
}
