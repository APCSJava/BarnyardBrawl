/*
 * Implements the BarnyardAnimal interface in a manner befitting a cow.
 * 
 * @author Nikolas Huth
 * @version 19 January, 2015
 */
public class Cow implements BarnyardAnimal {

	@Override
	public void greetFarmer() {
		System.out.println("moooo");
	}
	@Override
	public String toString() {
		return "The cow is a lazy animal. It eats grass and is used for food.";
	}
}
