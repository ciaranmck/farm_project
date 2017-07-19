import static org.junit.Assert.*;
import org.junit.*;
import farm_mgmt.*;
import java.util.ArrayList;


public class FarmTest {

  Farm farm;
  Farm farmTwo;

  @Before
  public void before() {
    farm = new Farm("Val's Farm", 50000);
    farmTwo = new Farm("Bob's Farm", 100000);
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

  @Test
  public void testFarmCanStockpileWool() {
    Sheep sheep_01 = new Sheep();
    farm.addSheepToPen(sheep_01);

    Alpaca alpaca_01 = new Alpaca();
    farm.addAlpacaToPen(alpaca_01);

    int shearedWool = farm.shearSheepPen() + farm.shearAlpacaPen();
    farm.addWoolToStock(shearedWool);

    assertEquals(50, farm.woolCount());
  }

  @Test
  public void testFarmCanSellWool() {
    Sheep sheep_01 = new Sheep();
    farm.addSheepToPen(sheep_01);

    Alpaca alpaca_01 = new Alpaca();
    farm.addAlpacaToPen(alpaca_01);

    int shearedWool = farm.shearSheepPen() + farm.shearAlpacaPen();
    farm.addWoolToStock(shearedWool);

    farm.sellWool(20);

    assertEquals(50100, farm.getBudget());
    assertEquals(30, farm.woolCount());
  }

  @Test
  public void testFarmCanBuyWool() {
    farm.buyWool(20);

    assertEquals(49900, farm.getBudget());
    assertEquals(20, farm.woolCount());
  }

  @Test
  public void testCanSellSheep() {
    Sheep sheep_01 = new Sheep();
    farm.addSheepToPen(sheep_01);
    
    sheep_01.setValue(400);

    farm.sellSheep(sheep_01.getValue());

    assertEquals(50400, farm.getBudget());
    assertEquals(0, farm.getSheepCount());
  }

  @Test
  public void testCanSellAlpaca() {
    Alpaca alpaca_01 = new Alpaca();
    farm.addAlpacaToPen(alpaca_01);
    
    alpaca_01.setValue(500);

    farm.sellAlpaca(alpaca_01.getValue());

    assertEquals(50500, farm.getBudget());
    assertEquals(0, farm.getSheepCount());
  }

  @Test
  public void testAnimalsCanBeMoved() {
    Alpaca alpaca_01 = new Alpaca();
    farm.addAlpacaToPen(alpaca_01);

    alpaca_01.setValue(500);

    Alpaca alpaca = farm.sellAlpaca(alpaca_01.getValue());
    farmTwo.buyAlpaca(alpaca, alpaca_01.getValue());


    assertEquals(1, farmTwo.getAlpacaCount());
    assertEquals(0, farm.getAlpacaCount());
    assertEquals(50500, farm.getBudget());
    assertEquals(99500, farmTwo.getBudget());
  }

}