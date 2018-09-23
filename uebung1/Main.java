package uebung1;

public class Main {
	public static void main(String[] args) {
		Studentin Andreas = new Studentin("Andreas");
		Studentin Paul = new Studentin("Paul");
		
		//Andreas.name = "Andreas";
		Andreas.groesse = 1.9;
		
		//Paul.name = "Paul";
		Paul.groesse = 1.75;
		
		Andreas.gibLaut();
		
	}
}
