package uebung2;

public class Studentin {
	String name;
	double groesse;
	
	public Studentin(String name) {
		this.name = name;
		System.out.println("Hallo Welt! Ich bins " + this.name);
	}
	
	public void gibLaut() {
		System.out.println("Ich heisse " + name + " und bin " + groesse +
				"m gross!");
		
	}
}
