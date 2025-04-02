package tag00_grundlagen;

import java.util.Scanner;

public class _05_EinundAusgabeKonsole {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte gib deinen Namen ein: ");
		
		String name = scanner.nextLine();
		
		System.out.println("Hallo, " + name + "!");
		
		scanner.close();

	}

}
