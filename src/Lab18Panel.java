import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.KeyListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.net.URL;

public class Lab18Panel extends JPanel {

	public Lab18Panel () {

		setLayout(new FlowLayout());
		setBackground(Color.gray);

		final TextField text = new TextField(15);
		final TextField text2 = new TextField(15);

		JLabel label = new JLabel("Convert decimal to binary.");
		label.setToolTextTip("Converter");
		JLabel label2 = new JLabel("Enter a decimal number into either of the text boxes and watch them be converted into binary in real time!");

		URL path = getClass().getResource("binary.jpg");
		ImageIcon image = new ImageIcon (path);
		JLabel binary = new JLabel (image);
		binary.setToolTextTip ("Image found on Google");

		add (label);
		add (text);
		add (text2);
		add (binary);

		text.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				TextField textField = (TextField) e.getSource();
				String textf = textField.getText();
				text2.setText(Integer.toBinaryString(Integer.parseInt(text)));
			}

			public void keyTyped(KeyEvent e) {}

			public void KeyPressed(KeyEvent e) {}
		});

		text2.addKeyListener(new Keylistener() {
			public void KeyReleased(KeyEvent e) {
				TextField textField = (TextField) e.getSource();
				String textf = textField.getText();
				text.setText(Integer.toBinaryString(Integer.parseInt(text)));
			}

			public void keyTyped(KeyEvent e) {}

			public void KeyPressed(KeyEvent e) {}
		});

	}
}