import static org.junit.Assert.*;
import org.junit.*;
import farm_mgmt.*;
import java.util.ArrayList;


public class FarmTest {

  Farm farm;

  @Before
  public void before() {
    farm = new Farm("Val's Farm", 50000);
  }

  @Test
  public void testFarmHasName() {
    assertEquals("Val's Farm", farm.getName());
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
  public void testFarmHasBudget() {
    assertEquals(50000, farm.getBudget());
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

  @Test
  public void testFarmHasWool() {
    assertEquals(0, farm.woolCount());
  }

  @Test
  public void testCanShearAlpacaPen() {
    Alpaca alpaca_01 = new Alpaca();
    farm.addAlpacaToPen(alpaca_01);

    Alpaca alpaca_02 = new Alpaca();
    farm.addAlpacaToPen(alpaca_02);

    assertEquals(60, farm.shearAlpacaPen());
  }

  @Test
  public void testCanShearSheepPen() {
    Sheep sheep_01 = new Sheep();
    farm.addSheepToPen(sheep_01);

    Sheep sheep_02 = new Sheep();
    farm.addSheepToPen(sheep_02);

    assertEquals(40, farm.shearSheepPen());
  }


}