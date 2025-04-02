package tag07_08_uebungen._12_Fitness_Tracker_Erweitert;

import javax.swing.JOptionPane;

public class FitnessTracker {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Geben Sie Ihren Namen ein: ");
		int alter = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie Ihr Alter ein: "));
		double gewicht = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie Ihr Gewicht ein: "));
		double groesse = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie Ihre Größe ein: "));
		
		double zielGewicht = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie Ihr Zielgewicht in kg ein: "));
		int schritteProTag = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie Ihr Schritte-Ziel pro Tag ein: "));
		double trainingszeitProWoche = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie Ihre wöchentliche Trainingszeit in Minuten ein: "));
		
		Ziel ziel = new Ziel(zielGewicht, schritteProTag, trainingszeitProWoche);
		Benutzer benutzer = new Benutzer(name, alter, gewicht, groesse, ziel);
		
		double aktuellesGewicht = gewicht - 3;
		benutzer.pruefeGewichtZiel(aktuellesGewicht);
		
		int aktuelleSchritte = schritteProTag + 1000;
		benutzer.pruefeSchritteZiel(aktuelleSchritte);
		
		int aktuelleTrainingszeit = (int) (trainingszeitProWoche + 20);
		benutzer.pruefeTrainingszeitZiel(aktuelleTrainingszeit);
		
		
		
		double bmi = benutzer.berechneBMI();
		
		String grundEmpfehlung = benutzer.gesundheitsEmpfehlung();
		String erweiterteEmpfehlung = benutzer.gesundheitsEmpfehlung(true);
		
		String meldung = String.format("Hallo %s!\nIhr BMI beträgt:%.2f\nGesundheitsempfehlung:%s\nErweiterte Empfehlung:%s ", 
				benutzer.getName(), bmi, grundEmpfehlung, erweiterteEmpfehlung);
		JOptionPane.showMessageDialog(null, meldung, "Gesundheitsempfehlung", JOptionPane.INFORMATION_MESSAGE);
	}
}
