/*
 * Implements the BarnyardAnimal interface in a manner befitting a dog.
 * 
 * @author Casey Perdue
 * @version 21 January, 2015
 */
public class DogTester {
	public static void main(String[] args) {
		BarnyardAnimal[] animals = new BarnyardAnimal[10];
		animals[0] = new Cdog(5);
		animals[1] = new Cdog(9);

		for (BarnyardAnimal animal : animals) {
			if (animal != null) {
				System.out.println(animal.toString());
				animal.greetFarmer();
			}
		}
		int compared = ((Cdog) animals[1]).compareTo((Cdog)animals[0]);
		if(compared==-1){
			System.out.println("The first dog is taller.");
		}else if(compared==0){
			System.out.println("The two dogs are the same height.");
		}else if(compared==1){
			System.out.println("The second dog is taller.");
		}
	}
}
