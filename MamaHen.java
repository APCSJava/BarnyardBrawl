public class MamaHen implements BarnyardAnimal, Comparable {
int weight;  
@Override
public void greetFarmer() {
  System.out.println("Sup Farmer");
 }
public MamaHen(int weight){
    this.weight = weight;
}
@Override
public String toString() 
{
return "Mama Hen is the queen of the farm";
}

public int compareTo(Object o) {
    MamaHen other = (MamaHen) o;
    if (this.weight == other.weight) return 0;
    if (this.weight < other.weight) return -1;
    return 1;
 }
}
