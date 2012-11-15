import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Medival {
	
	public static void main (String[] args) {
		
		JFrame frame = new JFrame ("Medival Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tab = new JTabbedPane();
		
		tab.addTab("Weapons", new WeaponsPanel());
		tab.addTab("Spells", new SpellsPanel());
		tab.addTab("Armor", new ArmorPanel());
		tab.addTab("Supplies", new SuppliesPanel());
		tab.addTab("Master", new MasterPanel());
		
		frame.getContentPane().add(tab);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(600, 600);
	}

}
