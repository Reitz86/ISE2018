package uebung6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugendkonto jk1 = new Jugendkonto();
		Jugendkonto jk2 = new Jugendkonto();
		
		System.out.println(jk1.getSaldo());
		System.out.println(jk1.einzahlen(15));
		System.out.println(jk1.ueberweisen(10, jk2, "Test"));
		System.out.println(jk1.getSaldo());
		System.out.println(jk2.getSaldo());
	}

}
