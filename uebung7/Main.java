package uebung7;

public class Main {
	
	public static void main(String[] args) {
		
		Radio r1 = new Radio("FFH");
				
		Mensch z1 = new Mensch("Peter", r1);
		Mensch z2 = new Mensch("Andi", r1);		
		Hund rudi = new Hund("Rudi", r1);
		
		r1.setStation("Klassik Radio");
	}

}
