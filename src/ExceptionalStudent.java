
public class ExceptionalStudent extends RuntimeException {
	
	public ExceptionalStudent() {
		super("default");
	}
	
	public ExceptionalStudent(String a) {
		super(a);
	}
}
