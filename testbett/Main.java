package testbett;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			Flugzeug f = new Boing();
			Boing b = new Boing("abc");
			((Boing) f).fliegen("a");
			Airbus f2 = new Airbus();
			f2.ring(new ArrayList<String>(Arrays.asList("Buenos Aires", "Córdoba", "La Plata")));
			ArrayList<Flugzeug> fList = new ArrayList<>();
			fList.add(f);
			fList.add(f2);
			fList.add(f);

			ObjectOutputStream oos = null;
			FileOutputStream fout = null;
			try{
			    fout = new FileOutputStream("C:\\Users\\areit\\Desktop\\address.ser", true);
			    oos = new ObjectOutputStream(fout);
			    oos.writeObject(fList);
			} catch (Exception ex) {
			    ex.printStackTrace();
			} finally {
			    if(oos != null){
			        oos.close();
			    } 
			}
			
			ObjectInputStream objectinputstream = null;
			try {
			    FileInputStream streamIn = new FileInputStream("C:\\Users\\areit\\Desktop\\address.ser");
			    objectinputstream = new ObjectInputStream(streamIn);
			    List<Flugzeug> readCase = (List<Flugzeug>) objectinputstream.readObject();
			    fList.addAll(readCase);
			} catch (Exception e) {
			    e.printStackTrace();
			} finally {
			    if(objectinputstream != null){
			        objectinputstream .close();
			    } 
			}

	}

}
