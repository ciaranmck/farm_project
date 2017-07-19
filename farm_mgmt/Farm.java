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

  public void removeSheepFromPen() {
    this.sheepPen.remove(0);
  }

  public void addAlpacaToPen(Alpaca alpaca) {
    this.alpacaPen.add(alpaca);
  }

  public void removeAlpacaFromPen() {
    this.alpacaPen.remove(0);
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

  public Sheep sellSheep(int value) {
    Sheep sheep = this.sheepPen.remove(0);
    this.budget += value;
    return sheep;
  }

  public Alpaca sellAlpaca(int value) {
    Alpaca alpaca = this.alpacaPen.remove(0);
    this.budget += value;
    return alpaca;
  }

  public void buySheep(Sheep sheep, int value) {
    this.sheepPen.add(sheep);
    this.budget -= value;
  }

  public void buyAlpaca(Alpaca alpaca, int value) {
    this.alpacaPen.add(alpaca);
    this.budget -= value;
  }

}