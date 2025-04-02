package tag07_08_uebungen._08;

public class Mitarbeiter {
	private String mitarbeiterID;
	private String name;
	private String position;
	private double gehalt;
	private int erfahrungsjahre;
	
	// Default-Kontstruktor
	public Mitarbeiter() {
		this.mitarbeiterID = "Unbekannt";
		this.name = "Unbekannt";
		this.position = "Unbekannt";
		this.gehalt = 0;
		this.erfahrungsjahre = 0;
	}	
	
	public Mitarbeiter(String mitarbeiterID, String name, String position) {
		this.mitarbeiterID = mitarbeiterID;
		this.name = name;
		this.position = position;
		this.gehalt = gehalt;
		this.erfahrungsjahre = erfahrungsjahre;
	}
	
	public Mitarbeiter(String mitarbeiterID, String name, String position, double gehalt, int erfahrungsjahre) {
		this.mitarbeiterID = mitarbeiterID;
		this.name = name;
		this.position = position;
		this.gehalt = gehalt;
		this.erfahrungsjahre = erfahrungsjahre;
	}
	
	// Getter-Methoden
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
	
	// Setter-Methoden
	public void setMitarbeiterID(String mitarbeiterID) {
		if (mitarbeiterID != null && mitarbeiterID.isEmpty()) {
			this.mitarbeiterID = mitarbeiterID;
		}else {
			System.out.println("Mitarbeiter-ID darf nicht leer sein.");
		}
	}
	 public void setGehalt(double gehalt) {
		if (gehalt >= 0) {
			this.gehalt = gehalt;
		}else {
			System.out.println("Gehalt kann nicht negativ sein.");
		}
	 }
	public void setErfahrungsJahre(int erfahrungsjahre) {
		if(erfahrungsjahre <= 0) {
			this.erfahrungsjahre = erfahrungsjahre;
		}else {
			System.out.println("Erfahrungsjahre können nicht negativ sein.");
		}		
	}
	public void mitarbeiterdatenausgeben() {
		System.out.println("MitarbeiterID: " + mitarbeiterID);
		System.out.println("Name: " + name);
		System.out.println("Position: " + position);
		System.out.println("Gehalt: " + gehalt);
		System.out.println("Erfahrungsjahre: " + erfahrungsjahre);
		System.out.println();
		}
}	

	

