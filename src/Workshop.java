
public class Workshop {

	public static void main(String[] args) throws Exception {
	
		//conc("Hi", null);
		System.out.println(addStrings(null, "hello"));
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
}
