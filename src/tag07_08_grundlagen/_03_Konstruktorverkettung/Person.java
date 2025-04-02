package tag07_08_grundlagen._03_Konstruktorverkettung;

public class Person {
	// Konstruktorverkettung ermöglicht es andere Konstruktoren der gleichen Klasse aufzurufen,
	// um Code-Duplikation zu vermeiden.
	
	// Erhöht Wartbarkeit und Verständnis
	
	// Es gibt einen "Hauptkonstruktor"
	
	
	// Private Instanzvariablen
	private String name;
	private int alter;
	
	// Konstruktor ohne Parameter, der Konstruktor mit zwei Parametern aufruft
	public Person() {
		this("Unbekannt", 0);
	}
	
	// Konstruktor mit einem Parameter (Name), der Konstruktor mit zwei Parametern aufruft
	public Person(String name) {
		this(name, 0);
	}
	
	// Hauptkonstruktor mit zwei Parametern (Name und Alter)
	public Person(String name, int alter) {
		this.name = name;
		this.alter = alter;
	}
	
	
	
}
