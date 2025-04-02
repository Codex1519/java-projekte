package tag07_08_uebungen._09_VerbesserDerMitarbeiterklasse;

public class Mitarbeiter {
	private String mitarbeiterID;
	private String name;
	private String position;
	private double gehalt;
	private int erfahrungsjahre;
	
	private static final String DEFAULT_MITARBEITERID = "EMP00";
	private static final String DEFAULT_NAME = "No Name";
	private static final String DEFAULT_POSITION = "Kameltreiber";
	private static final double DEFAULT_GEHALT = 0;
	private static final int DEFAULT_ERFAHRUNGSJAHRE = 0;
	
	
	// Default Konstruktor der alle Attribute entgegennimmt
	public Mitarbeiter() {
		this(DEFAULT_MITARBEITERID, DEFAULT_NAME, DEFAULT_POSITION, DEFAULT_GEHALT,DEFAULT_ERFAHRUNGSJAHRE);
	}
	
	// Weiterer Konstruktor, der Hauptkonstruktor aufruft und eigene Parameter übergibt und restliche Attribute mit Standartwerte setzt.
	public Mitarbeiter(String mitarbeiterID, String name, String position) {
		this(mitarbeiterID, name, position,0,0);
	}
	
	// Hauptkonstruktor mit alle Attributen
	public Mitarbeiter(String mitarbeiterID, String name, String position, double gehalt, int erfahrungsjahre) {
		setMitarbeiterID(mitarbeiterID);
		setName(name);
		setPosition(position);
		setGehalt(gehalt);
		setErfahrungsjahre(erfahrungsjahre);
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
			System.out.println("MitarbeiterID darf nicht leer sein. Standardwert  wird gesetzt.");
			this.mitarbeiterID = DEFAULT_MITARBEITERID;
		}
	}
	public void setName(String name) {
		if(name != null && !name.isEmpty()) {
		this.name = name;
	}else {
		System.out.println("Name darf nicht leer sein. Standardwert '" + DEFAULT_NAME + "'   wurde gesetzt.");
		this.name = DEFAULT_NAME;
	}
	}
	
	public void setPosition(String position) {
		if(position != null && !position.isEmpty()) {
		this.position = position;
	}else {
		System.out.println("Position darf nicht leer sein. Standardwert '" + DEFAULT_POSITION + "' wird gesetzt.");
				this.position = DEFAULT_POSITION;
	}
	}
	public void setGehalt(double gehalt) {
		if(gehalt >= 0) {
			this.gehalt = gehalt;
		}else {
			System.out.println("Gehalt kann nicht negativ sein. Standardwert '"+ DEFAULT_GEHALT + "' wird gesetzt");
			this.gehalt = DEFAULT_GEHALT;
		}
		
	}
	
	public void setErfahrungsjahre(int erfahrungsjahre) {
		if(erfahrungsjahre >=0) {
			this.erfahrungsjahre = erfahrungsjahre;
		}else {
			System.out.println("Erfahrungsjahre können nicht negativ sein. Standartwert '" + DEFAULT_ERFAHRUNGSJAHRE + "' wird gesetzt");
			this.erfahrungsjahre = DEFAULT_ERFAHRUNGSJAHRE;
		}
		
	}
	
	public void zeigemitarbeiterInfo() {
		System.out.println("MitarbeiterID: " + mitarbeiterID
				+ "\nName: " + name
				+ "\nPosition: " + position
				+ "\nGehalt: " + gehalt
				+ "\nErfahrungsjahre: " + erfahrungsjahre);
	}
	
}
