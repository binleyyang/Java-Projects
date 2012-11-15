import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class WeaponsPanel extends JPanel {

	public WeaponsPanel() {
		
		setLayout(new GridLayout(3,2));
		setBackground(Color.gray);
		
		JButton b1 = new JButton ("BroadSword");
		JButton b2 = new JButton ("Short Sword");
		JButton b3 = new JButton ("Great Axe");
		JButton b4 = new JButton ("Bow and Arrow");
		JButton b5 = new JButton ("Spear");
		JButton b6 = new JButton ("Warhammer");
		
		add (b1);
		add (b2);
		add (b3);
		add (b4);
		add (b5);
		add (b6);
	}
}
