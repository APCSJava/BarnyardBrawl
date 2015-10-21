/*
 *This is what the pigs do!
*/

public class Pig implements BarnyardAnimal {
	@Override
	public void greetFarmer() {
		System.out.println("Oink Oink");
		
	}
	public String toString() {
		return "The pigs like to roll around in the mud and eat the slop.";
	}
}
