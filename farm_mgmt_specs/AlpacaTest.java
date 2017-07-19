import static org.junit.Assert.*;
import org.junit.*;
import farm_mgmt.*;

public class AlpacaTest {

  Alpaca alpaca;

  @Before
  public void before() {
    alpaca = new Alpaca();
  }

  @Test
  public void testAlpacaHasName() {
    alpaca.setName("Bobcat");
    assertEquals("Bobcat", alpaca.getName());
  }

  @Test
  public void testAlpacaHasAge() {
    alpaca.setAge(5);
    assertEquals(5, alpaca.getAge());
  }

  @Test 
  public void testAlpacaHasColour() {
    alpaca.setColour("Brown");
    assertEquals("Brown", alpaca.getColour());
  }

  @Test
  public void testAlpacaHasGender() {
    alpaca.setGender("M");
    assertEquals("M", alpaca.getGender());
  }

  @Test 
  public void testAlpacaHasValue() {
    alpaca.setValue(500);
    assertEquals(500, alpaca.getValue());
  }

}