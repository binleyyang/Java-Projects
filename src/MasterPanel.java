import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

public class MasterPanel extends JPanel {
	
	public MasterPanel() {
		
		setLayout (new GridLayout(4, 2));
		setBackground (Color.green);
		
		WeaponsPanel p1 = new WeaponsPanel();
		SpellsPanel p2 = new SpellsPanel();
		ArmorPanel p3 = new ArmorPanel();
		SuppliesPanel p4 = new SuppliesPanel();
		
		add (p1);
		add (p2);
		add (p3);
		add (p4);
	}

}
