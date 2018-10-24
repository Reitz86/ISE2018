package uebung7;

public class Mensch extends Observer {
	private String name;
	private Radio radio;
	
	public Mensch(String name, Radio radio) {
		this.name = name;
		this.radio = radio;
		radio.attach(this);
		this.update();
	}
	
	@Override
	public void update() {
		System.out.println("My name is "+ this.name + " and I'm"
				+ " listening to " + this.radio.getStation());
	}
	
	
}
