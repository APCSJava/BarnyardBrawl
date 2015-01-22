/*
 * Implements the BarnyardAnimal interface in a manner befitting a horse.
 * 
 * @author Kent Collins
 * @version 14 September, 2014
 */
 
public class Horse implements BarnyardAnimal {

	@Override
	public void greetFarmer() {
		System.out.println("Neeiiiighh!");
	}
	
	@Override
	public String toString() {
		return "The horse is sturdy and powerful, capable of much work.";
	}

}
