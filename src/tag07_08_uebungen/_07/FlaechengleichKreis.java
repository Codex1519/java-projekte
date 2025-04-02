package tag07_08_uebungen._07;
import javax.swing.JOptionPane;

public class FlaechengleichKreis {

	public static void main(String[] args) {
		double laenge = Double.parseDouble
				(JOptionPane.showInputDialog("Bitte geben Sie die Länge des Rechtecks ein: "));
		double breite = Double.parseDouble
				(JOptionPane.showInputDialog("Bitte geben Sie die Breite des Rechtecks ein:"));
		
		// Erstellen der Objekte
		
		Rechteck rechteck = new Rechteck(laenge, breite);
		Kreis kreis = new Kreis();
		
		double rechteckFlaeche = rechteck.getFlaeche();
		
		kreis.setRadiusByFlaeche(rechteckFlaeche);
		
		System.out.println("Rechtecklänge: " + String.format("%.2f", laenge));
		System.out.println("Rechteckbreite: " + String.format("%.2f", breite));
		System.out.println("Rechteckfläche: " + String.format("%.2f", rechteck.getFlaeche()));
		System.out.println("Kreisradius: " + String.format("%.2f", kreis.getRadius()));
		System.out.println("Kreisfläche: " + String.format("%.2f", kreis.getFlaeche()));
	}

}
