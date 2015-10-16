/*
 * Implements the BarnyardAnimal interface in a manner befitting the void.
 * 
 * @author Molly Loughney
 * @version 16 October, 2015
 */
 
public class TheVoid implements BarnyardAnimal {

	@Override
	public void greetFarmer() {
		System.out.println("*incoherent screeching");
	}
	
	@Override
	public String toString() {
		return "gaze into the void and witness your oblivion";
	}

}