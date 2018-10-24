package uebung6;

import java.util.ArrayList;

public abstract class Konto {
	
	public ArrayList<Buchung> buchungsliste = new ArrayList<>();
	
	private String kontonummer;
	private String inhaber;
	
	public abstract double getSaldo();
	
	public String ueberweisen(double betrag, Konto empfaenger, String text) {
		return this.ueberweisen(betrag, empfaenger, text, "19.10.2018");
	}
	
	public String ueberweisen(double betrag, Konto empfaenger, String text, String datum) {
		if (this.getSaldo() - betrag < 0) {
			return "Zu wenig Kohle!";
		}
		else {
			Buchung b2 = new Buchung(-betrag, empfaenger, text, datum);
			buchungsliste.add(b2);
			Buchung b3 = new Buchung(betrag, this, text, datum);
			empfaenger.buchungsliste.add(b3);
			return "Ueberwiesen";
		}
	}
	
	public void text() {
		for (int i=0; i<this.buchungsliste.size();i++) {
			System.out.println(this.buchungsliste.get(i).betrag);
		}
	}
}
