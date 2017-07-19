import static org.junit.Assert.*;
import org.junit.*;
import farm_mgmt.*;
import java.util.ArrayList;


public class GuestTest {

  Guest guest;
  Farm farm;

  @Before
  public void before() {
    guest = new Guest("Ciaran", 100);
    farm = new Farm("Val's Farm", 50000);
  }

  @Test
  public void testHasName() {
    assertEquals("Ciaran", guest.getName());
  }

  @Test
  public void testHasWallet() {
    assertEquals(100, guest.getWallet());
  }

  @Test
  public void testCanRentAlpaca() {
    Sheep sheep = new Sheep();

    guest.rentAnimal(sheep);

    assertEquals(1, guest.checkRentals());
    assertEquals(90, guest.getWallet());
  }

  @Test
  public void testGuestCanReturnAnimal() {
    Sheep sheep = new Sheep();

    guest.rentAnimal(sheep);
    Animal animal = guest.returnAnimal();
    farm.addAnimalToPen(animal);

    assertEquals(0, guest.checkRentals());
    assertEquals(1, farm.getSortingPenCount());
  }

}