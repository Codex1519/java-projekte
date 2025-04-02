package tag07_08_uebungen._07;

import javax.swing.JOptionPane;

public class Kreistest {

	public static void main(String[] args) {
		
		double zahl = Double.parseDouble(JOptionPane.showInputDialog(
				"Bitte gib einen Radius für den Kreis ein: "));
		
		Kreis kreis = new Kreis(zahl);
		
		Kreis meinKreisOhneKonstruktor = new Kreis();
		meinKreisOhneKonstruktor.setRadius(5);
		
		System.out.println("Der Radius des Kreises beträgt: \n" + kreis.getRadius());
		System.out.println("Der Umfang beträgt: \n" + String.format("%.14f",kreis.getUmfang()));
		System.out.println("Die Flaeche beträgt: \n" + String.format("%.14f",kreis.getFlaeche()));

		double umfang = 50;
		kreis.setRadiusByUmfang(umfang);
		System.out.println("Neuer Umfang: " + umfang);
		System.out.println("Neuer Radius: " + String.format("%.2f", kreis.getRadius()));
		System.out.println("Berechnung neuer Umfang: " + String.format("%.2f", kreis.getUmfang()));
		
		
		double flaeche = 50;
		kreis.setRadiusByFlaeche(flaeche);
		System.out.println("Neue Fläche: " + flaeche);
		System.out.println("Neuer Radius: " + String.format("%.2f", kreis.getRadius()));
		System.out.println("Berechnung neue Fläche: " + String.format("%.2f", kreis.getFlaeche()));
	}

}
