/*
 * Implements BarnyardAnimal in the form of a chicken
 * 
 * @author Felicia Grable
 */
public class Chicken implements BarnyardAnimal {

	@Override
	public void greetFarmer() {
		System.out.println("Baauuwwwkk!");
	}
	
	@Override
	public String toString() {
		return "The chicken is a provider of the delicious egg, but is very tiny";
		
	}
}
