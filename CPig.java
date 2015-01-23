
public class CPig implements BarnyardAnimal, Comparable{

	
	int weight;
	
	public CPig(int n){
		
		weight = n;
	}
	
	
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		CPig other = (CPig) o;
		  if (this.weight == other.weight) return 0;
		  if (this.weight <= other.weight) return -1;
		  return 1;
	}

	
	public void greetFarmer() {
		// TODO Auto-generated method stub
		System.out.println("Oink, Oink!");
	}
	
	public String toString(){
		
		return "I make BACON!";
	}

	
	
	
}
