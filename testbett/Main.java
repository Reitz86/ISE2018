package testbett;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Flugzeug f = new Boing();
			Boing b = new Boing("abc");
			((Boing) f).fliegen("a");
			Airbus f2 = new Airbus();
			f2.ring(new ArrayList<String>(Arrays.asList("Buenos Aires", "Córdoba", "La Plata")));
			f2.ring({"Buenos Aires", "Córdoba", "La Plata"});
			ArrayList<Flugzeug> fList = new ArrayList<>();
			fList.add(f);
			fList.add(f2);
			fList.add(f);
			for(int i=0;i<fList.size();i++) {
				System.out.println((fList.get(i)).test(1, 2));
			}
	}

}
