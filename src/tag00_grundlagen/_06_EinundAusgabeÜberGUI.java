package tag00_grundlagen;

import javax.swing.JOptionPane;

public class _06_EinundAusgabeÜberGUI {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Gib deinen Namen ein: ");
		
		JOptionPane.showMessageDialog(null, "Hallo " + name + "! Schön, dass du hier bist.");

	}

}
