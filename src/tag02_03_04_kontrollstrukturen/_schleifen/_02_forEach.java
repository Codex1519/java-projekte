package tag02_03_04_kontrollstrukturen._schleifen;

public class _02_forEach {

	public static void main(String[] args) {
		int[] zahlen = {2, 5, 1, 2, 6};
		
		for(int zahl : zahlen) {
			System.out.println("Zahl im Array: " + zahl);
		}
		
		for(int i = 0; i < zahlen.length; i+=2) {
			System.out.println("Zahl im Array mit normaler for-Schleife: " + zahlen[i]);
			
		}
	}

}
