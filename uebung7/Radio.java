package uebung7;

public class Radio extends Subject {
	private String station;
	
	public Radio(String station) {
		this.station = station;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
		this.notifyObservers();
	}
	
	

}
