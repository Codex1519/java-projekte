package tag07_08_grundlagen._02_MehrereKonstruktoren;

public class App {

	public static void main(String[] args) {
		Person person1 = new Person();
		
		System.out.println("Name Person 1: " + person1.getName() 
				+ "\nAlter Person 1: " + person1.getAlter());
		
		Person person2 = new Person("Hendrik");
		System.out.println("Name Person 2: " + person2.getName() 
				+ "\nAlter Person2: " + person2.getAlter());
		
		Person person3 = new Person("Yves" ,37);
		System.out.println("Name Person 3: " + person3.getName() 
				+ "\nAlter Person 3: " + person3.getAlter());
		
		
		System.out.println(person3.getAlter());
		System.out.println(person3.getName());

	}

}
