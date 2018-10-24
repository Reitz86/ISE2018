package uebung6;

public class KontoFactory {

	public static Konto baueKonto(String Kontotyp) { // "giro", "tages", "jugend"
		if (Kontotyp.equals("giro")) {
			Girokonto gk = new Girokonto();
			return gk;
		}
		else if (Kontotyp.equals("tages")) {
			Tagesgeld tk = new Tagesgeld();
			return tk;
		}
		else {
			Jugendkonto jk = new Jugendkonto();
			return jk;
		}
		
	}
}
