package farm_mgmt;
import behaviours.*;

public class Sheep extends Animal implements Shearable {

  private int wool;

  public Sheep() {
    super();
     this.wool = 20;
  }

  public int shearAnimal() {
   return this.wool; 
  }


}