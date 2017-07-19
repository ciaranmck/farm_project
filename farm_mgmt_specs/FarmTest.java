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

  @Test
  public void testSheepPenIsEmpty() {
    assertEquals(0, farm.getSheepCount());
  }

  @Test
  public void testAlpacaPenIsEmpty() {
    assertEquals(0, farm.getAlpacaCount());
  }

  @Test
  public void testCanAddSheepToPen() {
    Sheep sheep_01 = new Sheep();
    farm.addSheepToPen(sheep_01);
    assertEquals(1, farm.getSheepCount());
  }

  @Test
  public void testCanAddAlpacaToPen() {
    Alpaca alpaca_01 = new Alpaca();
    farm.addAlpacaToPen(alpaca_01);
    assertEquals(1, farm.getAlpacaCount());
  }

}