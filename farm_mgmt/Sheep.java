package farm_mgmt;
import behaviours.*;

public class Sheep extends Animal implements Shearable {

  private int wool;

  public Sheep() {
    super();
    this.wool = 20;
  }

  public int hasWool() {
    return this.wool;
  }

  // public int shearAnimal() {
  //     int shearedWool = 0;
        
  //     this.wool += shearedWool;
      
  //     return shearedWool;
  //   }

  public int shearAnimal() {
    int shearedWool = this.wool;

    if (shearedWool == this.wool) {
      this.wool -= 20;
    }
    return shearedWool;
  }

}