package farm_mgmt;
import java.util.ArrayList;


public class Farm {

  private String name;
  private ArrayList<Sheep> sheepPen;
  private ArrayList<Alpaca> alpacaPen;
  private int woolStock;

  public Farm(String name) {
    this.name = name;
    this.sheepPen = new ArrayList<Sheep>();
    this.alpacaPen = new ArrayList<Alpaca>();
    this.woolStock = woolStock;
  }

  public String getName() {
    return this.name;
  }

  public int getSheepCount() {
    return this.sheepPen.size();
  }

  public int getAlpacaCount() {
    return this.alpacaPen.size();
  }

  public void addSheepToPen(Sheep sheep) {
    this.sheepPen.add(sheep);
  }

  public void addAlpacaToPen(Alpaca alpaca) {
    this.alpacaPen.add(alpaca);
  }

  public int woolCount() {
    return this.woolStock;
  }

  public int shearAlpacaPen() {
    int counter = 0;
    for (Alpaca alpaca : this.alpacaPen) {
      counter += alpaca.shearAnimal();
    }
    return counter;
  }

  public int shearSheepPen() {
    int counter = 0;
    for (Sheep sheep : this.sheepPen) {
      counter += sheep.shearAnimal();
    }
    return counter;
  }


}