/*
 * Test class that demonstrates polymorphism through an interface.
 * 
 * @author Kent Collins
 * @version 12 September, 2014
 */


public class BarnyardTester {

	public static void main(String[] args) {
		BarnyardAnimal[] animals = new BarnyardAnimal[10];
		animals[0] = new Horse();
		animals[1] = new Doge();
		animals[2] = new Owl();
		animals[3] = new TheVoid();
		animals[4] = new Dinosaur();
		animals[5] = new DapperFellow();
		animals[6] = new Chicken();
		animals[7] = new JohnCena();
		animals[8] = new WoolyPig();
		animals[9] = new HoneyBadger();

		for (BarnyardAnimal animal : animals) {
			if (animal != null) {
				System.out.println(animal.toString());
				animal.greetFarmer();
			}
		}

	}

}
