package testbett;

import java.io.Serializable;
import java.util.ArrayList;

public class Airbus extends Flugzeug implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public int test(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
	public void ring(ArrayList<String> a) {
		return;
	}
	
	public void ring(String[] a) {
		return;
	}

	@Override
	public String toString() {
		return "Airbus [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
