package tag07_08_grundlagen._02_Konstruktoren._01_einfacheKonstruktor;

public class App {

	public static void main(String[] args) {
		Person person = new Person("Yves" ,37);
		
		System.out.println(person.getAlter());
		System.out.println(person.getName());

	}

}
