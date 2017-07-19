import static org.junit.Assert.*;
import org.junit.*;
import farm_mgmt.*;
import java.util.ArrayList;


public class FarmTest {

  Farm farm;

  @Before
  public void before() {
    farm = new Farm("Bob's Farm");
  }

  @Test
  public void testFarmHasName() {
    assertEquals("Bob's Farm", farm.getName());
  }

}