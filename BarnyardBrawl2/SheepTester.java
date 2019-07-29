
/**
 * Write a description of class SheepTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SheepTester{
    
    public static void main(String[] args) { 
        Sheep sheepy = new Sheep(87);
        Sheep shoopy = new Sheep(110);
        if(sheepy.compareTo(shoopy) > 0){
            System.out.println("Sheepy is the heavier sheep!");
        }else if(sheepy.compareTo(shoopy) < 0){
            System.out.println("Shoopy is the heavier sheep!");
        }else{
            System.out.println("Sheepy and Shoopy are equal in weight!");
        }
    }
   
}
