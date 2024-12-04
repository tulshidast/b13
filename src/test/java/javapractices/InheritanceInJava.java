package javapractices;

public class InheritanceInJava {

	public static void main(String[] args) {

//		TwoWheelerVehicle twoWheelerVehicle = new TwoWheelerVehicle();
//		twoWheelerVehicle.run();
//		twoWheelerVehicle.gearChangingMach();

		PetrolCosumingTwoWheelers petrolCosumingTwoWheelers = new PetrolCosumingTwoWheelers();
		petrolCosumingTwoWheelers.run();
		petrolCosumingTwoWheelers.gearChangingMach();
		System.out.println(petrolCosumingTwoWheelers.color);
	}

}

class Vehicle {

	// instance member variable
	String color;
	String mfg;
	int numberOfWheels;

	// instance member functions
	public void run() {
		System.out.println("Vehicle is running");
	}
}

class TwoWheelerVehicle extends Vehicle {

	// instance member variable
	public void gearChangingMach() {
		System.out.println("Chaneg gear by padel");
	}

}

class PetrolCosumingTwoWheelers extends TwoWheelerVehicle {

}

class FourWheelerVehicle extends Vehicle {

	public void changeGear() {
		System.out.println("change gear by hand");
	}
}
