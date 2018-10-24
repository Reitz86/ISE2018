package uebung6;

import java.util.ArrayList;

public class Jugendkonto extends Konto implements Abhebbar {


	@Override
	public double getSaldo() {
		double saldo = 0;
		for (int i=0; i < buchungsliste.size(); i++) {
			Buchung b1 = buchungsliste.get(i);
			double bbetrag = b1.betrag;
			saldo += bbetrag;
		}
		return saldo;
	}
	
	@Override
	public String einzahlen(double betrag) {
		Buchung b = new Buchung(betrag, this, "Einzahlung", "12.10.2018");
		this.buchungsliste.add(b);
		return "Betrag " + betrag + " eingezahlt!";
	}

	@Override
	public String auszahlen(double betrag) {
		// TODO Auto-generated method stub
		return null;
	}



}
