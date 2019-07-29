
public class SheepdogTester {
	public static void main(String[] args) {
		Sheepdog sheepy = new Sheepdog(10);
		Sheepdog sheepso = new Sheepdog(10);
		Sheepdog shep = new Sheepdog(8);
		
		if( sheepy.compareTo(sheepso) == 0  ){
			System.out.println("They are the same");
		}
		else{
			System.out.println("They are not the same");
		}
		if( sheepy.compareTo(shep) == 0  ){
			System.out.println("They are the same");
		}
		else{
			System.out.println("They are not the same");
		}
	}
}
