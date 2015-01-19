/*
 * Implements the BarnyardAnimal interface in a manner befitting a goat.
 * 
 * @author Monica Brendsel
 * @version 1/19/15
 */
 
public class Goat implements BarnyardAnimal {

	@Override
	public void greetFarmer() {
		System.out.println("Maaaaaaaa!");
	}
	
	@Override
	public String toString() {
		return "The goat likes to eat hay.";
	}
}
