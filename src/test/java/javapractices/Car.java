package javapractices;

public class Car {

	public static void main(String[] args) {
		Exp c = new Exp();
		c.running();
		c.generationTourque();
		System.out.println(c.color);
	}

}

class Exp {
	// instance member variables
	String color = "White";
	String manufacturer;
	float groundClearence;
	float price;

	// instance member functions/methods
	public void running() {
		System.out.println("Running car");
	}

	public void generationTourque() {
		System.out.println("generating tourque");
		price = 8.33f;
		System.out.println(price);
	}

}
