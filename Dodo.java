/*
 * Implements the BarnyardAnimal interface in a manner befitting the last of its kind.
 * 
 * @author Duncan Khosla
 * @version 19 January, 2015
 */
public class Dodo implements BarnyardAnimal {

	@Override
	public void greetFarmer() {
		System.out.println("Raphus Cucullatus!");
	}
	
	@Override
	public String toString() {
		return "I'm the last of my kind.";
	}

}