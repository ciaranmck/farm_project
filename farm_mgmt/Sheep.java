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

  public int shearAnimal() {
    int shearedWool = this.wool;

    if (shearedWool == this.wool) {
      while (this.wool > 0) {
        this.wool--;
      }
    }
    return shearedWool;
  }

}