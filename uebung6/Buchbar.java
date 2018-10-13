package uebung6;

public interface Buchbar {
	public String ueberweisen(double betrag, Konto empfaenger, String text);
	public String ueberweisen(double betrag, Konto empfaenger, String text, String datum);
}
