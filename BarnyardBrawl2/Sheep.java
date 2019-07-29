
/**
 * Write a description of class Sheep here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sheep implements BarnyardAnimal, Comparable{
   int weight;
   
   public Sheep(int weight){
       this.weight = weight;
    }
    
   
    public void greetFarmer() {
        System. out.println("BaAAaAaaah");
    }
    
    
    public String toString(){
        return "I am Sheep";
    }
    
    @Override
    public int compareTo(Object o){
       Sheep diff = (Sheep) o;
       if (this.weight == diff.weight) return 0;
       if (this.weight <= diff.weight) return -1;
       return 1;
        
    }
   
}
