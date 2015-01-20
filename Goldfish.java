/*
 * Implements the BarnyardAnimal interface in a manner befitting a Goldfish.
 * 
 * @author Kent Collins
 * @version 20 January, 2015
 */
 
public class Goldfish implements BarnyardAnimal {

	@Override
	public void greetFarmer() {
		System.out.println("Blub blub blub");
	}
	
	@Override
	public String toString() {
		return "Also called the dragons of the sea, Goldfish are known for their tough, unforgiving attitude.";
	}

}
