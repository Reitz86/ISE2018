package uebung7;

public class Hund extends Observer {
	private Radio radio;
	private String name;
	
	public Hund(String name, Radio radio) {
		this.name = name;
		this.radio = radio;
		radio.attach(this);
		this.update();
	}
	
	public void update() {
		System.out.println("Wuff wuff. Ich bins " + this.name
				+ "und ich hoere" + this.radio.getStation());
	}

}
