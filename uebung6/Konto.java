package uebung6;

import java.util.ArrayList;

public abstract class Konto {
	
	public ArrayList<Buchung> buchungsliste = new ArrayList<>();
	
	private String kontonummer;
	private String inhaber;
	
	public abstract double getSaldo();
	
	public void text() {
		for (int i=0; i<this.buchungsliste.size();i++) {
			System.out.println(this.buchungsliste.get(i).betrag);
		}
	}
}
