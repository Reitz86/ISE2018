package uebung7;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> observers = new ArrayList<>();
	
	public void attach(Observer o) {
		this.observers.add(o);
	}
	
	public void detach(Observer o) {
		this.observers.remove(o);
	}
	
	public void notifyObservers() {
		for (int i=0; i<this.observers.size(); i++) {
			observers.get(i).update();
		}
	}
}
