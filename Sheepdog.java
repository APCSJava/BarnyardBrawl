
public class Sheepdog implements BarnyardAnimal {
	
	int speed;
	
	public Sheepdog(int speed){
		this.speed = speed;
	}
	
	@Override
	public void greetFarmer() {
		System.out.println("Woof! Woof");
	}
	
	@Override
	public String toString() {
		return "The sheepdog is a responsible leader, manages the sheep very well.";
	}
	
	public int compareTo(Object o) {
		  Sheepdog other = (Sheepdog) o;
		  if (this.speed == other.speed) return 0;
		  if (this.speed <= other.speed) return -1;
		  return 1;
	}
}
