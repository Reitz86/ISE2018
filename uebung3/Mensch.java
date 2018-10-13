package uebung3;

public abstract class Mensch {

	private String vorname;
	private String name;

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sagHallo() {
		System.out.println("Hallo mein Name ist " + vorname + " "
				+ name);
	}
}
