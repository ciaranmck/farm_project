package farm_mgmt;
import java.util.ArrayList;

public class Guest {

  private String name;
  private ArrayList<Animal> rental;

  public Guest(String name) {
    this.name = name;
    this.rental = new ArrayList<Animal>();
  }

  public String getName() {
    return this.name;
  }

}