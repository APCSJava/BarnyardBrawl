/*
 * Implements the BarnyardAnimal interface in a manner befitting a Goldfish.
 * 
 * @author Sarah Brunsberg
 * @version 22 January, 2016
 */
 
public class Goldfish implements BarnyardAnimal {
	
	int blubsPerMinute;

	public Goldfish(int blubsPerMinute){
	  this.blubsPerMinute = blubsPerMinute;
	}


	@Override
	public void greetFarmer() {
		System.out.println("Blub blub blub");
	}
	
	@Override
	public String toString() {
		return "Also called the dragons of the sea, Goldfish are known for their tough, unforgiving attitude.";
	}
	
	public int compareTo(Goldfish c) {
		  if (this.blubsPerMinute == c.blubsPerMinute) return 0;
		  if (this.blubsPerMinute < c.blubsPerMinute) return -1;
		  return 1;
	}

}
