/*
 * Implements the BarnyardAnimal interface in a manner befitting a Gila Monster.
 * 
 * @author Doug Heynderickx
 * @version 20 January, 2015
 */
 
public class GilaMonster implements BarnyardAnimal {
  @Override
	public void greetFarmer() {
		System.out.println("SSSSSSsssSSSSSSSsssssSSSSSSS");
	}
	
	@Override
	public String toString() {
		return "The Gila Monster is a small little fellow. He eats bugs.";
	}

}
