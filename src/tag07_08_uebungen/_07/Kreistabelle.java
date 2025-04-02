package tag07_08_uebungen._07;

import javax.swing.JOptionPane;

public class Kreistabelle {

	public static void main(String[] args) {
		double startRadius = Double.parseDouble(JOptionPane.showInputDialog("Bitte gib den Startwert für den Radius ein: "));
		double radiusErhoehung = Double.parseDouble(JOptionPane.showInputDialog("Bitte den Wert für Radiuserhöhung eingeben: "));
		
		Kreis kreisTabelle = new Kreis(startRadius);
		
		System.out.println("Radius\t\tUmfang\t\tFläche");
		
		for(int i =0; i <30;i++) {
			System.out.printf("%.1f\t\t%.14f\t%.14f\n", 
					kreisTabelle.getRadius(), kreisTabelle.getUmfang(), kreisTabelle.getFlaeche());
			
		kreisTabelle.setRadius(kreisTabelle.getRadius() + radiusErhoehung);	
		}
		
	}

}
