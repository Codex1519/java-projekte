package tag07_08_uebungen._12_Fitness_Tracker_Erweitert;

public class Ziel {
	private double zielGewicht;
	private int schritteProTag;
	private double trainingszeitProWoche;
	
	// Konstruktor
	public Ziel( double zielGewicht, int schritteProTag, double trainingszeitProWoche) {
		this.zielGewicht = zielGewicht;
		this.schritteProTag = schritteProTag;
		this.trainingszeitProWoche = trainingszeitProWoche;
	}
	
	public String gewichtZielErreicht(double aktuellesGewicht) {
		if(aktuellesGewicht <= zielGewicht) {
			return this.anpassenZiel("Gewicht");
		}else {
			return ("Zielgewicht nicht erreicht.");
		}
	}
	
	public String schritteZielErreicht(int aktuelleSchritte) {
		if(aktuelleSchritte >= schritteProTag) {
			return this.anpassenZiel("Schritte");
		}else {
			return "Zielschritte nicht erreicht.";
		}
	}
	
	public String trainingszeitZielErreicht(int aktuelleTrainingszeit) {
		if(aktuelleTrainingszeit >= trainingszeitProWoche) {
			return this.anpassenZiel("Trainingszeit");
		}else {
			return "Traininzeitziel nicht erreicht.";
		}
	}
	
	public String anpassenZiel(String zielTyp) {
		switch(zielTyp) {
		case "Schritte":
			this.schritteProTag += schritteProTag * 0.1;
			return "Das tägliche Schritte-Ziel wurde um 10% erhöht. Neues Ziel: " + schritteProTag;
		case "Gewicht":
			this.zielGewicht -= zielGewicht * 0.05;
			return "Das Zielgewicht wurde um 5% reduziert. Neues Zielgewicht: " + zielGewicht;
		case "Trainingszeit":
			this.trainingszeitProWoche += trainingszeitProWoche * 0.1;
			return "Das wöchentliche Trainingszeit-Ziel wurde um 10% erhöht. Neues Ziel: " + trainingszeitProWoche + " Minuten";
		default:
			return "Unbekanntes Ziel. Bitte gültige folgende Eingaben: Schritte, Gewicht oder Trainingszeit.";
		}	
	}
}
