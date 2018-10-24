package uebung6;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Konto> konten = new ArrayList<>(); 
		System.out.println("Welchen Kontotyp anlegen?");
		int wahl = 1; // 1 jugend 2 giro 3 tagesgeld
		KontoFactory kf = new KontoFactory();
		Konto k = kf.baueKonto("giro");
	}

}
