package tag07_08_uebungen._12_Fitness_Tracker_Erweitert;

public class Benutzer {
	private String name;
	private int alter;
	private double gewicht;
	private double groesse;
	private Ziel ziel; // Komposition: Klasse "Benutzer" hat ein Objekt einer anderen Klasse "Ziel" als Attribut
	
	
	public Benutzer(String name, int alter) {
		this(name,alter, 70, 170, null);
	}
	
	// Konstruktor mit name alter gwicht und groesse
	public Benutzer(String name, int alter, double gewicht, double groesse, Ziel ziel) {
		setName(name);
		setAlter(alter);
		setGewicht(gewicht);
		setGroesse(groesse);
		this.ziel = ziel;
	}
	
	public void pruefeGewichtZiel(double aktuellesGewicht) {
		if(ziel != null) System.out.println(ziel.gewichtZielErreicht(aktuellesGewicht));
		else System.out.println("Zielgewicht wurde erreicht.");
	
	}
	
	public void pruefeSchritteZiel(int aktuelleSchritte) {
		if(ziel!= null) System.out.println(ziel.schritteZielErreicht(aktuelleSchritte));
		else System.out.println("Zielschritte wurden erreicht.");
	}
	
	public void pruefeTrainingszeitZiel(int aktuelleTrainingszeit) {
		if(ziel != null) System.out.println(ziel.trainingszeitZielErreicht(aktuelleTrainingszeit));
		System.out.println("Ziel wurde erreicht");
	}
	
	// Methode zur Berechnung vom BMI
	public double berechneBMI() {
		return gewicht / Math.pow(groesse / 100, 2);
	}
	
	
	public String gesundheitsEmpfehlung() {
		double bmi = berechneBMI();
		if(bmi < 18.5) {
			return "Untergewicht - Besprechen Sie Ihre Ziele mit einem Ernährungsberater.";
		}else if(bmi >= 18.5 && bmi <= 24.9) {
			return "Normalgewicht - Gute Arbeit, weiter so !";
		}else if(bmi >= 25 && bmi <= 29.9) {
			return "Übergewicht - Ein moderates Trainingsprogramm wäre empfehelenswert.";
		}else {
			return "Adipositas - Fettes Kind ! Nimm ab!";
		}
	}
	
	// Überladene Methode
	public String gesundheitsEmpfehlung(boolean erweiterteEmpfehlung) {
		String empfehlung = gesundheitsEmpfehlung();
		if(erweiterteEmpfehlung) {
			if(alter < 18) {
				return " \nDa Sie unter 18 sind, sollten Sie Ihr Wachstum und Ihre Entwicklung berücksichtigen.";
			}else if (alter >= 18 && alter <= 29) {
				return " \nIn Ihrem Alter sind regelmäßige Bewegung und eine ausgewogene Ernährung besonders wichtig.";
			}else if (alter >= 30 && alter <= 49) {
				return " \nHalten Sie ein ausgewogenes Verhältnis von Bewegung und Ernährung besonders wichtig.";
			}else {
				return " Regelmäßige Bewegung zur Gelenkgesundheit ist besonders wichtig,";
			}
		}
		return empfehlung;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(name != null && !name.isEmpty()) {
			this.name = name;
		}else {
			this.name = "unbekannt";
			System.out.println("Name darf nicht null oder leer sein. Standardwert 'unbekannt' wird gesetzt.");
		}
	}
	
	public int getAlter() {
		return alter;
	}
	
	public void setAlter(int alter) {
		if(alter > 0 && alter <= 120) {
			this.alter = alter;
		}else {
			this.alter = 0;
			System.out.println("Das Alter darf nicht negativ gesetzt werden oder gleich 0 sein."
					+ "Standardwert '18' wird gesetzt.");
		}
	}
	
	public double getGewicht() {
		return gewicht;
	}
	
	public void setGewicht(double gewicht) {
		if(gewicht > 0) {
			this.gewicht = gewicht;
		}else {
			this.gewicht = 60;
			System.out.println("Gewicht darf nicht negativ sein. Standardwert '70' wird gesetzt.");
		}
	}
	
	public double getGroesse() {
		return gewicht;
	}
	
	public void setGroesse(double groesse) {
		if(groesse > 0) {
			this.groesse = groesse;
		}else {
			this.groesse = 175;
			System.out.println("Größe darf nicht negativ sein. Standardwert '175 cm' wird gesetzt.");
		}
	}
}
