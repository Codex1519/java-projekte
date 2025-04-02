package tag07_08_uebungen._08_Yves;

public class Mitarbeiter {
	private String mitarbeiterID;
	private String name;
	private String position;
	private double gehalt;
	private int erfahrungsjahre;
	
	// Default Konstruktor
	public Mitarbeiter() {
		setMitarbeiterID("EMP00");
		setName ("Unbekannt");
		setPosition("Kameltreiber");
		setGehalt(0);
		setErfahrungsjahre(0);
	}
	
	// Überladener Konstruktor (Initialisiert mitarbeiter ID, name und position
	public Mitarbeiter(String mitarbeiterID, String name, String position) {
		setMitarbeiterID(mitarbeiterID);
		setName(name);
		setPosition(position);
		setGehalt(0);
		setErfahrungsjahre(0);
	}
	
	public String getMitarbeiterID() {
		return mitarbeiterID;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPosition() {
		return position;
	}
	
	public double getGehalt() {
		return gehalt;
		
	}
	
	public int getErfahrungsjahre() {
		return erfahrungsjahre;
	}
	
	public void setMitarbeiterID(String mitarbeiterID) {
		if(mitarbeiterID != null && !mitarbeiterID.isEmpty()) {
			this.mitarbeiterID = mitarbeiterID;
		}else {
			System.out.println("MitarbeiterID darf nicht leer sein.");
		}
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public void setGehalt(double gehalt) {
		if(gehalt >= 0) {
			this.gehalt = gehalt;
		}else {
			System.out.println("Gehalt kann nicht negativ sein.");
		}
		
	}
	
	public void setErfahrungsjahre(int erfahrungsjahre) {
		if(erfahrungsjahre >=0) {
			this.erfahrungsjahre = erfahrungsjahre;
		}else {
			System.out.println("Erfahrungsjahre können nicht negativ sein.");
		}
		
	}
	
	public void zeigemitarbeiterInfo() {
		System.out.println("MitarbeiterID: " + mitarbeiterID
				+ "nName: " + name
				+ "\nPosition: " + position
				+ "\nGehalt: " + gehalt
				+ "\nErfahrungsjahre: " + erfahrungsjahre);
	}
	
}
