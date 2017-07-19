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

}