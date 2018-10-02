package uebung3;

public class Flugzeug implements KannFliegen {
	
	private Pilot[] p = new Pilot[2];
	private Gast[] g = new Gast[600];
	private Stewardess[] s = new Stewardess[6];
	
	int anzP = 0;
	int anzG = 0;
	int anzS = 0;
	
	public void fliegen() {
		
	}
	
	public Pilot[] getP() {
		return p;
	}

	public void setP(Pilot[] p) {
		this.p = p;
	}

	public Gast[] getG() {
		return g;
	}

	public void setG(Gast[] g) {
		this.g = g;
	}

	public Stewardess[] getS() {
		return s;
	}

	public void addS(Stewardess s) {
		this.s[anzS] = s;
		anzS++;
	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	private int nummer;
}
