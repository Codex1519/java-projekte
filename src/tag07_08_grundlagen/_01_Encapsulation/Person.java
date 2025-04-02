package tag07_08_grundlagen._01_Encapsulation;

public class Person {
	private int alter;
	private boolean istVolljährig;
	
	// Defaultwerte bei Instanzattributen
	// short, byte, int, long = 0
	// float, double = 0.0
	// char = "\u0000" 
	// boolean = false;
	// Refernzen auf Objekte = null

	
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
