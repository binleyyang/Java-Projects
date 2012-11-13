
public class Workshop {

	public static void main(String[] args) throws Exception {
	
		//conc("Hi", null);
		System.out.println(addStringsAgain("hi", "hello"));
	}
	
	private static String conc (String a, String b) throws Exception {
		
		if (a.equals(null) || b.equals(null)) {
			throw new Exception();
		}
		return a + b;
	}
	
	//@SuppressWarnings("finally")
	private static String addStrings (String a, String b) {
		String result = "";
		try {
			result = conc(a, b);
		}
		catch (Exception e) {
			System.out.println("Error!");
		}
		finally {
			return result;
		}
	}
	
	private static String addStringsAgain (String a, String b) {
		String result = "";
		try {
			result = conc(a, b);
		}
		catch (Exception e) {
			e.printStackTrace();
			result = "There is an error.";
		}
		finally {
			return result;
		}
	}
	
	private static String part5 (String a, String b, int x) throws ExceptionalStudent, ArithmeticException {
		
		if (a.equals("Celeste"))
			throw new ExceptionalStudent("Celeste!");
		else if (x == 0) {
			throw new ArithmeticException();
		}
		return a + b;
	}
	
	private static int Ted (String a, String b, int x) {
		try {
			part5(a, b, x);
		}
		catch (ExceptionalStudent e) {
			System.out.println("First string is Celeste");
		}
		catch (ArithmeticException e) {
			System.out.println("Bad Math!");
		}
		finally {
			return 0;
		}
	}
}
