package uebung6;

public class Buchung {
	double betrag;
	Konto empfaenger;
	String zweck;
	String datum;
	
	public Buchung(double betrag, Konto empfaenger, String zweck, String datum) {
		this.betrag = betrag;
		this.empfaenger = empfaenger;
		this.zweck = zweck;
		this.datum = datum;
	}
}
