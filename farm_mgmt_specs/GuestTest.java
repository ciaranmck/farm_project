import static org.junit.Assert.*;
import org.junit.*;
import farm_mgmt.*;
import java.util.ArrayList;


public class GuestTest {

  Guest guest;

  @Before
  public void before() {
    guest = new Guest("Ciaran", 100);
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
  }

}