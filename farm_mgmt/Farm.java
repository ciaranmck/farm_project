package farm_mgmt;
import java.util.ArrayList;


public class Farm {

  private String name;
  private ArrayList<Sheep> sheepPen;
  private ArrayList<Alpaca> alpacaPen;
  private int woolStock;
  private int budget;

  public Farm(String name, int budget) {
    this.name = name;
    this.sheepPen = new ArrayList<Sheep>();
    this.alpacaPen = new ArrayList<Alpaca>();
    this.woolStock = woolStock;
    this.budget = budget;
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

  public int woolCount() {
    return this.woolStock;
  }

  public int getBudget() {
    return this.budget;
  }

  public void addSheepToPen(Sheep sheep) {
    this.sheepPen.add(sheep);
  }

  public void addAlpacaToPen(Alpaca alpaca) {
    this.alpacaPen.add(alpaca);
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

  public void addWoolToStock(int wool) {
    this.woolStock += wool;
  }

  public int sellWool(int weight) {
    this.woolStock -= weight;
    int profit = weight * 5;
    this.budget += profit;
    return weight;
  }

  public void buyWool(int weight) {
    this.woolStock += weight;
    int cost = weight * 5;
    this.budget -= cost;
  }

}