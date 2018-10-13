package uebung6;

public class Girokonto extends Konto implements Abhebbar, Buchbar {

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String ueberweisen(double betrag, Konto empfaenger, String text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ueberweisen(double betrag, Konto empfaenger, String text, String datum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String einzahlen(double betrag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String auszahlen(double betrag) {
		// TODO Auto-generated method stub
		return null;
	}

}
