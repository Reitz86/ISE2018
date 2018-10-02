package uebung2;

public class Studentin {
	String name;
	static int anz;
	double groesse;
	
	public Studentin(String name) {
		this.name = name;
		anz++;
		groesse = 1.9;
		System.out.println("Hallo Welt! Ich bins " + this.name);
	}
	
	public void gibLaut() {
		System.out.println("Ich heisse " + name + " und bin " + groesse +
				"m gross! Ich bin der " + anz + "te Student(in)");
		
	}
}
