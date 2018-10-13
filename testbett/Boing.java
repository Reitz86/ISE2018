package testbett;

public class Boing extends Flugzeug implements KannFliegen{
	
	
	public Boing() {
		// TODO Auto-generated constructor stub
	}
	
	public Boing(String name) {
		System.out.println(name);
	}
	
	public int test(String a) {
		return 5;
	}
	
	public int test(String a, int b) {
		return 5;
	}
	
	
	public void lenken() {
		System.out.println("links rechts");
	}

	@Override
	public String fliegen(String a) {
//		System.out.println("Flieg Flieg Flieg wie ein Flieger");
		return "umpa lumpa";		
	}
}
