import javax.swing.*;


public class ProjectTest {
	
	public static void main (String [] args) {
		
		
		
		ProjectRational rational = new ProjectRational(num, den, num2, den2);
		
		
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the lower bound integer:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the higher bound integer:"));	

	int x1, y1, x2, y2;

	for (int i1 = -a; i1 <= a; i1++){
		for(int i2 = -b; i2 <= b; i2++){
			for (int i3 = -a; i3 <= a; i3++){
				for (int i4 = -a; i4 <= a; i4++){
					System.out.println(sum(i1,i2,i3,i4));
					//System.out.println(difference(i1,i2,i3,i4));
					//System.out.println(product(i1,i2,i3,i4));
					//System.out.println(quotient(i1,i2,i3,i4));
				}
			}
		}
	}
	}
}
	