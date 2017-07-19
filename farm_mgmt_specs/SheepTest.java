import static org.junit.Assert.*;
import org.junit.*;
import farm_mgmt.*;

public class SheepTest {

  Sheep sheep;

  @Before
  public void before() {
    sheep = new Sheep();
  }

@Test
public void testSheepHasName() {
  sheep.setName("Dolly");
  assertEquals("Dolly", sheep.getName());
}

@Test
public void testSheepHasAge() {
  sheep.setAge(2);
  assertEquals(2, sheep.getAge());
}

@Test 
public void testSheepHasColour() {
  sheep.setColour("White");
  assertEquals("White", sheep.getColour());
}

@Test
public void testSheepHasGender() {
  sheep.setGender("F");
  assertEquals("F", sheep.getGender());
}

@Test 
public void testSheepHasValue() {
  sheep.setValue(400);
  assertEquals(400, sheep.getValue());
}

}