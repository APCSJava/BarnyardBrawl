
/**
 * Write a description of class Sheep here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sheep implements BarnyardAnimal {
   @Override
   public void greetFarmer(){
       System.out.println("BaaAaaAaAh");
    }
    
    @Override
    public String toString(){
        return "I am goat";
}
}