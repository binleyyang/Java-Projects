import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Lab08 extends JPanel {
	
	public static void main (String[] args) {
		
		int counter = 0;
		int total = 0;
		int max = 0;
		int min = 0;
		int number;
		double average;

		
		do {			
			
			number = Integer.parseInt(JOptionPane.showInputDialog(null, "Please input a positive integer, or a negative integer to quit. "));
			
			if (number > 0) {
			
				if(number > max) {
					max = number;
				}

				if(number < min) {
					min = number;
				}
			
				total += number;
				counter++;
			}
			
		} while (number > 0);
		
		average = total / counter;
		
		JOptionPane.showMessageDialog(null, "The sum of the numbers is: " + total);
		JOptionPane.showMessageDialog(null, "The total numbers entered is: " + counter);
		JOptionPane.showMessageDialog(null, "The average of the numbers entered is: " + average);
		JOptionPane.showMessageDialog(null, "The minimum of the numbers entered is: " + min);
		JOptionPane.showMessageDialog(null, "The maximum of the numbers entered is: " + max);
	
		
		
		int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter an integer: "));
		int factorial = 1;
		long factorial2 = 1;
		
		for (int i = 1; i <= n; i++) {
			factorial *= i;
			factorial2 *= i;
		}
	
		JOptionPane.showMessageDialog(null, "The int factorial of " + n + " is: " + factorial);
		JOptionPane.showMessageDialog(null, "The long factorial of " + n + " is: " + factorial2);		
		
	}
	
	public static String convert (int x) {
		return Integer.toString(x);
	}
	
	public void paintComponent (Graphics g) {
		
		super.paintComponent(g);
		
		for (int count = 0; count <= 400; count += 20) {
			
			if (count == 200) {
				g.setColor(Color.black);
			} else g.setColor(Color.red);
			
			g.drawLine(count,0,count,400);
			g.drawLine(0, count, 400, count);

			g.setColor(Color.gray);
			int xaxis = ((count/20)-10);
			int yaxis = -((count/20)-10);

			g.drawString(convert(xaxis), count, 220);
			g.drawString(convert(yaxis), 180, count);
		
			
			
		}
		
	}
	
}


