import static org.junit.Assert.*;
import org.junit.*;
import farm_mgmt.*;
import java.util.ArrayList;


public class GuestTest {

  Guest guest;

  @Before
  public void before() {
    guest = new Guest("Ciaran");
  }

  @Test
  public void testHasName() {
    assertEquals("Ciaran", guest.getName());
  }

}