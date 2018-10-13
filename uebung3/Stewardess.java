package uebung3;

public class Stewardess extends Mensch {

	private String rang;
	private String[] sprachen;
	
	@Override
	public void sagHallo() {
		System.out.println("Wollen sie einen Tomatensaft?");
	}
}
