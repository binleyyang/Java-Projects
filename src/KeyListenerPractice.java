import java.awt.*;
import java.awt.event.*;
import java.net.URL;

import javax.swing.*;

public class KeyListenerPractice extends JPanel implements MouseListener {
	
	public KeyListenerPractice() {
		
		setLayout(new BorderLayout());
		setBackground(Color.gray);
		
		URL path = getClass().getResource("king_of_diamonds.jpg");
		final ImageIcon image = new ImageIcon (path);
		final JLabel card = new JLabel(image);
		
		URL path2 = getClass().getResource("back.jpg");
		final ImageIcon image2 = new ImageIcon (path2);
		final JLabel card2 = new JLabel(image2);
		
		add (card, BorderLayout.CENTER);
		add (card2, BorderLayout.CENTER);

		card.addMouseListener (new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				card.setIcon(image2);
			}
		});
		
		card2.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				card2.setIcon(image);
			}
		});
		
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {}
	
	@Override
	public void mouseEntered(MouseEvent arg0) {}
	
	@Override
	public void mouseExited(MouseEvent arg0) {}
	
	@Override
	public void mousePressed(MouseEvent arg0) {}
	
	@Override
	public void mouseReleased(MouseEvent arg0) {}
}