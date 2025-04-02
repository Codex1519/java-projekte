package tag07_08_grundlagen._02_MehrereKonstruktoren;

public class Person {
	private String name;
	private int alter;
	private boolean istVolljährig;
	
	// Konstruktor ohne  Parameter
	public Person() {
		this.name = "unbekannt";
		this.alter = 0;
	}
	// Konstruktor mit einem Parameter
	public Person(String name) {
		setName(name);
		this.alter = 0;
	}
	
	// Konstruktor mit zwei Parametern, name und alter
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
