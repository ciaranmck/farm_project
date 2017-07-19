package farm_mgmt;
import behaviours.*;

public class Alpaca extends Animal implements Shearable {

  private int wool;

  public Alpaca() {
    super();
    this.wool = 30;
  }

  public int shearAnimal() {
    return this.wool;
  }


}