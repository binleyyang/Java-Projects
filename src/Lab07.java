import java.awt.Graphics;
import javax.swing.*;

public class Lab07 extends JPanel{
	
	public static void main (String [] argssss) {
    
    //P A R T 1 ///////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
	double speed = Double.parseDouble(JOptionPane.showInputDialog(null, "How fast have you been going in miles per hour?"));
	double hours = Double.parseDouble(JOptionPane.showInputDialog(null, "How many hours have you been travelling for?"));
	double checker = Math.ceil(hours) - hours;
	
	
	for ( double counter = 1; counter <= hours; counter ++) {
		double distance = speed*counter;
	    System.out.println("After " + counter + " hours you will have gone " + distance + " miles");
	}
	
	double finalDistance = speed*hours;
	
	if (checker != 0) {
		System.out.println("After " + hours + " hours you will have gone " + finalDistance + " miles");
	}
	
	
	//P A R T 3  //////////////////////////////////////////////////////////////////////////////////////////////////////////				
	
	int rows = Integer.parseInt(JOptionPane.showInputDialog(null, "How many rows do you want the diamond to have?"));
			
			double firsthalf = (Math.ceil(rows/2))+1;
			double spacedouble = firsthalf - 1;
			double secondhalf = rows-firsthalf;
			
				for (double counting = 1; counting <= firsthalf; counting++) { //first half of diamond
					 double stars = (2*counting)-1; //stars is total number of stars for each row
					for (double co = 1; co <= stars; co++) { //co is a counter
			
						System.out.print("*");
						
					}	
					
					System.out.println("");
					
				}
					
				for (double finalcount = secondhalf; finalcount >= 1; finalcount--) { //second half of diamond
					double stars2 = (2*finalcount)-1;
					for (double co2 = stars2; co2 >=1; co2--) {
						System.out.print("*"); }
					    System.out.println("");
					}
	
	JOptionPane.showMessageDialog(null, "Time to sing the Twelve Days of Christmas!");
	
	
	for (int day = 1; day <= 12; day++) {
        String dayString;
        switch (day) {
            case 1:  dayString = "first";
                     break;
            case 2:  dayString = "second";
                     break;
            case 3:  dayString = "third";
                     break;
            case 4:  dayString = "fourth";
                     break;
            case 5:  dayString = "fifth";
                     break;
            case 6:  dayString = "sixth";
                     break;
            case 7:  dayString = "seventh";
                     break;
            case 8:  dayString = "eighth";
                     break;
            case 9:  dayString = "ninth";
                     break;
            case 10: dayString = "tenth";
                     break;
            case 11: dayString = "eleventh";
            		 break;
            case 12: dayString = "twelfth";
            	     break;		 
            default: dayString = "EHHH";
                     break;
        }
        
        System.out.print("On the " + dayString + " day of Christmas my true love gave to me... ");
        
        for (int verse = 1; verse <=day; verse++) {
        String verseString;
        switch (verse) {
        case 12: verseString = "A Partridge in a Pear Tree";
        		break;
        case 11: verseString = "2 Turtle Doves";
        		break;
        case 10: verseString = "3 French Hens";
				break;
        case 9: verseString = "4 Colly Birds";
				break;
        case 8: verseString = "5 Gold Rings";
				break;
        case 7: verseString = "6 Geese-a-Laying";
				break;
        case 6: verseString = "7 Swans-a-Swimming";
				break;
        case 5: verseString = "8 Maids-a-Milking";
				break;
        case 4: verseString = "9 Ladies Dancing";
				break;
        case 3: verseString = "10 Lords-a-Leaping";
				break;
        case 2: verseString = "11 Pipers Piping";
				break;
        case 1: verseString = "12 Drummers Drumming";
				break;
        default: verseString = "ENNNNNN";
				break;
        }
        
        
        System.out.print(verseString + ". ") ; 
        
        }
        System.out.println("");
        }
	
}
		
	
	//P A R T 2  //////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Go to Lab7Initializer.java to run Part 2  //////////////////////////////////////////////////////////////////////////
	
	private int circles;
	
	public Lab07 (int circlesChoice) { //constructor for number of circles
		circles = circlesChoice;
	}
	
	public void paintComponent(Graphics g)
	
	{
		super.paintComponent(g);
		
		int a = 5;
		int b = 10;
		
		for (int count = 0; count < circles; count++) {
		
			g.drawOval(450-(a*count), 450-(a*count), 10+(b*count), 10+(b*count));
				
		}
		
			} 
			
}