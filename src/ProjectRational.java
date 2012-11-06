
public class ProjectRational {

	private int num;
	private int den;
	private int num2;
	private int den2;
		
	public ProjectRational(int num1X, int den1X, int num2X, int den2X) {
		
		num = num1X;
		den = den1X;
		num2 = num2X;
		den2 = den2X;
		
	}
	
	public int getNum1(){
		return num;
	}
	
	public int getDen1(){
		return den;
	}
	
	public int getNum2(){
		return num2;
	}
	
	public int getDen2(){
		return den2;
	}
	
	public static int gcf(int a, int b) {//en.wikipedia.org/wiki/Euclidean_algorithm , http://stackoverflow.com/questions/4009198/java-get-greatest-common-divisor
	if (b==0) {
		return a;
	}
	return gcf(b, a%b);
	}

	public static String sum (int a, int b, int c , int d){
		String fraction = a + "/" + b, fraction2 = c + "/" + d;
		int x = gcf(((a*d)+(c*b)), (b*d));
		String sum = ((a*d)+(c*b))/x + "/" + (b*d)/x;
		return fraction + " + " + fraction2 + " = " + sum;
	}
}