import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import javax.swing.JButton;

public class SuppliesPanel extends JPanel{
	
	public SuppliesPanel() {
		
		setLayout (new GridBagLayout());
		setBackground (Color.red);
		
		JButton b1 = new JButton ("Food");
		JButton b2 = new JButton ("Coins");
		JButton b3 = new JButton ("Tools");
		JButton b4 = new JButton ("Travel Pass");
		JButton b5 = new JButton ("Horses");
		
		add (b1);
		add (b2);
		add (b3);
		add (b4);
		add (b5);
	}
}
