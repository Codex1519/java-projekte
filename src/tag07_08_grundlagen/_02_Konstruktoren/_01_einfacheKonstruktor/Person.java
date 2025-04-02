package tag07_08_grundlagen._02_Konstruktoren._01_einfacheKonstruktor;

public class Person {
	private String name;
	private int alter;
	private boolean istVolljährig;
	
	public Person() {
		this.name = "unbekannt";
		this.alter = 0;
	}
	
	
	// Kontstruktor der Klasse Person
	// Konstruktor mit zwei Parametern, name und alter
	// Kontstuktor heißt immer genau wie die Klasse und hat keinen Rückgabetyp !
	public Person(String name, int alter) {
		setName(name);
		setAlter(alter);
		
	}
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAlter(int alter) {
		if(alter >= 0 && alter <= 200) {
			this.alter = alter;
			istVolljährig = alter >= 18 ? true : false;
		}else System.out.println("Person ist zu jung oder zu alt. (Bereich 0 bis 200).");
	}
	
	public int getAlter() {
		return alter;
	}
	
	public boolean getIstVolljährig() {
		return istVolljährig;
	}
	
	// istVolljährig hat keinen eigene Setter-Methode, da über setAlter mitgesteuert
	// bitte zukünftig alle Klassen, die Attribute und Methoden, kapseln!

}
