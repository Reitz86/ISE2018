package uebung2;

public class Auto {
	public double tempo;
	public double tankinhalt;
	private int AnzReifen;
	public int AnzSitze;
	private Studentin fahrer;
	public static int anz;
	
	public Auto(double tempo, double tankinhalt, int AnzReifen, int AnzSitze) {
		this.tempo = tempo;
		this.tankinhalt = tankinhalt;
		this.AnzReifen = AnzReifen;
		this.AnzSitze = AnzSitze;
		
	}
	
	
	
	public void setFahrer(Studentin f) {
		this.fahrer = f;
	}
	
	public void beschleunigen(double diff) {
		this.tempo += diff;
	}
	
	public void abbremsen(double diff) {
		this.tempo -= diff;
	}
	
	public void tanken(double l) {
		
	}

	public int getAnzReifen() {
		return AnzReifen;
	}

	public void setAnzReifen(int anzReifen) {
		if (anzReifen > 0 && anzReifen % 2 == 0) {
			this.AnzReifen = anzReifen;
			System.out.println("Reifenzahl: " + this.AnzReifen);
		}
		else {
			System.out.println("Falsche Anzahl");
		}
		
	}
	
}
