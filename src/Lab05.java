import javax.swing.*;

public class Lab05 {
	
	public static void main (String[] args) {
		
		String count[] = {"none", "first", "second", "third", "fourth"};
		String candidate[] = {"Obama or Romney", "Biden or Ryan", "presidential", "vice-presidential"};
		
		String name = JOptionPane.showInputDialog(null, "Hi! What's your name?");
		int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Hello " + name + ", how many hours would you like to study this Friday night? "));
		
		while (x <= 5)
			x = Integer.parseInt(JOptionPane.showInputDialog(null, "You aren't studying enough, please try again."));
		if (x > 5)
			JOptionPane.showMessageDialog(null, name + ", you're gonna be successful in the future.");
		
		double total;
		int counter;
		int hours;
		double average;
		
		total = 0;
		counter = 1;
		
		while (counter <= 4)
			{
			hours = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of hours you studied every Friday for the " + count[counter] + " Friday of this week."));
			total = total + hours;
			counter++;
			}
		
		average = total / 4;
		
		JOptionPane.showMessageDialog(null, "You studied an average of " + average + " hours this past month on Fridays");

		
		int counter2;
		counter2 = 0;
		
		while (counter2 <= 1)
			
			{String president = JOptionPane.showInputDialog(null, "Which " + candidate[counter2 + 2] + " candidate do you prefer? " + candidate[counter2] + "? Enter \"don't care\" to quit.");
				if (president.equals("Obama") || president.equals("Romney") || president.equals("Biden") || president.equals("Ryan"))
					JOptionPane.showMessageDialog(null, "Good for you! Have a cookie.");
				counter2++;				
			}

		int gradeTotal;
		int gradeCounter;
		double gradeAverage;
		
		gradeCounter = 0;
		gradeTotal = 0;
		
		String letterGrade = (JOptionPane.showInputDialog(null, "Please input your first letter grade to be averaged, enter N for \"0\", or press Q to quit: "));
		
		while (!letterGrade.equals("Q")) {			
			
			if (letterGrade.equals("A")) 
				gradeTotal += 95;
				
			if (letterGrade.equals("B")) 
				gradeTotal += 85;

			if (letterGrade.equals("C")) 
				gradeTotal += 75;

			if (letterGrade.equals("D")) 
				gradeTotal += 65;

			if (letterGrade.equals("F")) 
				gradeTotal += 50;

			if (letterGrade.equals("N")) 
				gradeTotal += 0;

			gradeCounter++;
			
			letterGrade = JOptionPane.showInputDialog(null, "Please input your next letter grade to be averaged, or press Q to quit: ");
		}
		
		
		if (gradeCounter != 0) {
			
			gradeAverage = (double) (gradeTotal / gradeCounter);
			
			JOptionPane.showMessageDialog(null, "The average of the numbers you entered is: " + gradeAverage );
			
			if (gradeAverage >= 97)
				JOptionPane.showMessageDialog(null, "The grade average is an A+.");	
			else if (gradeAverage >= 93)
				JOptionPane.showMessageDialog(null, "The grade average is an A.");
			else if (gradeAverage >= 90)
				JOptionPane.showMessageDialog(null, "The grade average is an A-.");
			else if (gradeAverage >= 87)
				JOptionPane.showMessageDialog(null, "The grade average is a B+.");
			else if (gradeAverage >= 83)
				JOptionPane.showMessageDialog(null, "The grade average is a B.");
			else if (gradeAverage >= 80)
				JOptionPane.showMessageDialog(null, "The grade average is a B-.");
			else if (gradeAverage >= 77)
				JOptionPane.showMessageDialog(null, "The grade average is a C+.");
			else if (gradeAverage >= 73)
				JOptionPane.showMessageDialog(null, "The grade average is a C.");
			else if (gradeAverage >= 70)
				JOptionPane.showMessageDialog(null, "The grade average is a C-.");		
			else if (gradeAverage >= 67)
				JOptionPane.showMessageDialog(null, "The grade average is a D+.");
			else if (gradeAverage >= 63)
				JOptionPane.showMessageDialog(null, "The grade average is a D.");
			else if (gradeAverage >= 60)
				JOptionPane.showMessageDialog(null, "The grade average is a D-.");
			else if (gradeAverage>= 0)
				JOptionPane.showMessageDialog(null, "The grade average is a F.");
						
			
		} else {
			JOptionPane.showMessageDialog(null, "Exiting program." );
		}
		
	}
	
}