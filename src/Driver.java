public class Driver{
	
	public static void main(String[] args){

		rockband r1 = new rockband("Tom", "Jerry", "Hakkyung", 5, 6, 7);
		person p1 = new person(8, "Matt");
		person p2 = new person(9, "Mattt");
		person p3 = new person(10, "Matttt");
	
		rockband r2 = new rockband(p1, p2, p3);

		System.out.println(p1.getName());
		
		
		
	}
}
	