package eigeneUebungen._AdventofCode2023._Day01;

public class Trebuchet {
	public static void main(String [] args) {
		
		String[] lines = {
				"1abc2",
				"pqr3stu8vwx",
				"a1b2c3d4e5f",
				"treb7uchet"
		};
		
		int totalSum = 0;
		
		for (String line : lines) {

			int firstDigit = -1;
			int lastDigit = -1;
			
			for(int i = 0; i < line.length(); i++) {
				char ch = line.charAt(i);
				if(Character.isDigit(ch)) {
					int digit = Character.getNumericValue(ch);
					
					if (firstDigit == -1) {
						firstDigit = digit;
					}
					lastDigit = digit;
					
				}
			}
			if(firstDigit != -1 && lastDigit!= -1) {
				int combinedValue = firstDigit *10 + lastDigit;
				totalSum += combinedValue;
				System.out.println(line +  combinedValue);
			}
		}
		System.out.println(totalSum);
	}
}
