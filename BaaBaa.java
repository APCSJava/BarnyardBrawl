/*
 * Implements the BarnyardAnimal interface in a manner befitting a sheep.
 * 
 * @author Roxy Sammons
 * @version 20 January, 2015
 */
 
public class Sheep implements BarnyardAnimal {

	@Override
	public void greetFarmer() {
		System.out.println("Baaaaaaaa! I aaaaaaam Jooooooey.");
	}
	
	@Override
	public String toString() {
		return "The sheep is often mistaken for a cloud due to its fluffy wool. It is  known for a mentioning in the famous song, 'Mary Has a Little Lamb'.";
	}

}
