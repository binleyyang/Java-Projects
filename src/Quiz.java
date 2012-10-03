import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Please type in a, b, c: ");
		
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		
		double disc = Math.pow(b*b - 4*a*c, .5);
		
		double x1 = (-b + disc) / (2*a);
		double x2 = (-b - disc) / (2*a);
		
		System.out.printf("The quadratic formula is %f %f", x1, x2);
	}
}