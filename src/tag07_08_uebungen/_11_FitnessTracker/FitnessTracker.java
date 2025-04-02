package tag07_08_uebungen._11_FitnessTracker;

import javax.swing.JOptionPane;

public class FitnessTracker {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Geben Sie Ihren Namen ein: ");
		int alter = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie Ihr Alter ein: "));
		double gewicht = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie Ihr Gewicht ein: "));
		double groesse = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie Ihre Größe ein: "));
		
		Benutzer benutzer = new Benutzer(name, alter, gewicht, groesse);
		
		double bmi = benutzer.berechneBMI();
		
		String grundEmpfehlung = benutzer.gesundheitsEmpfehlung();
		String erweiterteEmpfehlung = benutzer.gesundheitsEmpfehlung(true);
		
		String meldung = String.format("Hallo %s!\nIhr BMI beträgt:%.2f\nGesundheitsempfehlung:%s\nErweiterte Empfehlung:%s ", 
				benutzer.getName(), bmi, grundEmpfehlung, erweiterteEmpfehlung);
		JOptionPane.showMessageDialog(null, meldung, "Gesundheitsempfehlung", JOptionPane.INFORMATION_MESSAGE);
	}
}
