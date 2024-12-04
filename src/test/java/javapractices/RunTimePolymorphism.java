package javapractices;

public class RunTimePolymorphism {

	public static void main(String[] args) {

		VehicleA v = new TwoWheelerVehicleA();
		v.changeGear();

	}

}

class VehicleA {

	public void changeGear() {
		System.out.println("Four wheeler gear changing machnism");
	}
}

class TwoWheelerVehicleA extends VehicleA {

	public void changeGear() {

		System.out.println("two wheeler gear changing machnism");
	}
}