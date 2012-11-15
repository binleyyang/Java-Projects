import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Cats extends JFrame {
	
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	
	public Cats() {
		
		super ("Wild Cats");
		setLayout(new FlowLayout());
		
		Icon lion = new ImageIcon(getClass().getResource("lion.jpg"));
		Icon tiger = new ImageIcon(getClass().getResource("tiger.jpg"));
		Icon panther = new ImageIcon(getClass().getResource("panther.jpg"));
		Icon cheetah = new ImageIcon(getClass().getResource("cheetah.jpg"));
		Icon cat = new ImageIcon(getClass().getResource("cat.jpg"));
		
		label1 = new JLabel();
		label1.setText("This is a panther");
		label1.setIcon(panther);
		label1.setHorizontalTextPosition(SwingConstants.CENTER);
		label1.setVerticalTextPosition(SwingConstants.BOTTOM);
		label1.setToolTipText("This is the label for a Panther");
		add(label1);
		
		label2 = new JLabel();
		label2.setText("This is a lion");
		label2.setIcon(lion);
		label2.setHorizontalTextPosition(SwingConstants.CENTER);
		label2.setVerticalTextPosition(SwingConstants.BOTTOM);
		label2.setToolTipText("This is the label for a Lion");
		add(label2);
		
		label3 = new JLabel();
		label3.setText("This is a tiger");
		label3.setIcon(tiger);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		label3.setToolTipText("This is the label for a tiger");
		add(label3);
		
		label4 = new JLabel();
		label4.setText("This is a cheetah");
		label4.setIcon(cheetah);
		label4.setHorizontalTextPosition(SwingConstants.CENTER);
		label4.setVerticalTextPosition(SwingConstants.BOTTOM);
		label4.setToolTipText("This is the label for a cheetah");
		add(label4);
		
		label5 = new JLabel();
		label5.setText("This is a cat");
		label5.setIcon(cat);
		label5.setHorizontalTextPosition(SwingConstants.CENTER);
		label5.setVerticalTextPosition(SwingConstants.BOTTOM);
		label5.setToolTipText("This is the label for a cat");
		add(label5);
		
	}
}