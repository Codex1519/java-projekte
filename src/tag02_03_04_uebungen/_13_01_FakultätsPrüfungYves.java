package tag02_03_04_uebungen;

import java.util.Scanner;

public class _13_01_FakultätsPrüfungYves {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Geben Sie bitte eine Zahl ein: ");
		long zahl = scanner.nextLong();
		
		if(zahl < 1) {
			System.err.println("Fakultäten sind immer >=1");
		}else {
			long nummer = zahl;
			long teiler = 2;
			
			while(nummer % teiler == 0) {
				nummer /= teiler;
				teiler++;
			}
			
			if(nummer == 1) {
				System.out.println(zahl + " = " + (teiler -1) + "!");
			}else {
				System.out.println(zahl + " ist keine Fakultätszahl");
			}
		}

	}

}
