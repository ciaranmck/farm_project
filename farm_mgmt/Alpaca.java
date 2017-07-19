package farm_mgmt;
import behaviours.*;

public class Alpaca extends Animal implements Shearable {

  private int wool;

  public Alpaca() {
    super();
    this.wool = 30;
  }

  public int hasWool() {
    return this.wool;
  }

  public int shearAnimal() {
    int shearedWool = this.wool;

    if (shearedWool == this.wool) {
      this.wool -= 30;
    }
    return shearedWool;
  }

  // public int shearAnimal(ArrayList<Alpaca> alpacas) {
  //   counter = 0;
  //   for (int alpaca : alpacas) {
  //     this.wool += counter;
  //   }
  //   return counter;
  // }


}