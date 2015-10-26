/*
 * Test class that demonstrates polymorphism through an interface.
 * 
 * @author Kent Collins
 * @version 12 September, 2014
 */


public class BarnyardTester {

	public static void main(String[] args) {
		BarnyardAnimal[] animals = new BarnyardAnimal[10];
		
		for (BarnyardAnimal animal : animals) {
			if (animal != null) {
				System.out.println(animal.toString());
				animal.greetFarmer();
			}
		}

	}

}
