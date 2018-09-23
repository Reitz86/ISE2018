package uebung2;

public class Main {
	public static void main(String[] args) {
		
		Auto porsche = new Auto(0, 0, 4, 5);
		Studentin a = new Studentin("Peter");
		porsche.setAnzReifen(4);
		porsche.setFahrer(a);
		
	}
}
