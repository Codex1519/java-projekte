package tag06_grundlagen._02_Methoden._01_einfacheMethode;

public class App {
	public static void main(String[] args) {
		// In der Regel hat eine Klasse keine main-Methode, sondern dient als eigener Typ
		// einem Hauptprogramm.
		
		// Das Hauptprogramm ist selbst wieder eine Klasse, die aber die Aufgabe hat, das Programm zu starten,
		// Services, Dienste usw. zu initialisieren. 
		
		// Die main-Methode dient der JVM (Java Virtual Machine) als "Einstiegspunkt" in das Programm
		
		// Die Trennung von Zuständigkeiten (Typ und Hauptprogramm) dient dem SRP 
		// (Single Responsible Principle) (Clean Code Prinzipien)
		
		Auto meinAuto = new Auto();
		meinAuto.marke = "Seat";
		meinAuto.ps = 170;

		meinAuto.zeigeDetails();
		
		Auto meinAuto2 = new Auto();
		meinAuto2.marke = "BMW";
		meinAuto2.ps = 250;

		meinAuto2.zeigeDetails();
	}
}
