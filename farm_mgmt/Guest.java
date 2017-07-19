package farm_mgmt;
import java.util.ArrayList;

public class Guest {

  private String name;
  private ArrayList<Animal> rental;
  private int wallet;

  public Guest(String name, int wallet) {
    this.name = name;
    this.rental = new ArrayList<Animal>();
    this.wallet = wallet;
  }

  public String getName() {
    return this.name;
  }

  public int checkRentals() {
    return this.rental.size();
  }

  public int getWallet() {
    return this.wallet;
  }

  public void rentAnimal(Animal animal) {
    this.rental.add(animal);
    wallet -= 10;
  }

}