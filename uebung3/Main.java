package uebung3;

public class Main {
	public static void main(String[] args) {
		Flugzeug f = new Flugzeug();
		Stewardess s1 = new Stewardess();
		Stewardess s2 = new Stewardess();
		Stewardess s3 = new Stewardess();
		Stewardess s4 = new Stewardess();
		Stewardess s5 = new Stewardess();
		Stewardess s6 = new Stewardess();
		
		s6.setName("Spears");
		s6.setVorname("Britney");
		
		s6.sagHallo();
		
		f.addS(s1);
		f.addS(s2);
		f.addS(s3);
		f.addS(s4);
		f.addS(s5);
		f.addS(s6);
		
		

		
		
	}
}
