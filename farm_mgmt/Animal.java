package farm_mgmt;

public abstract class Animal {

  private String name;
  private int age;
  private String colour;
  private String gender;
  private int value;

  public Animal() {
    this.name = name;
    this.age = age;
    this.colour = colour;
    this.gender = gender;
    this.value = value;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getColour() {
    return this.colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public String getGender() {
    return this.gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public int getValue() {
    return this.value;
  }

  public void setValue(int value) {
    this.value = value;
  }

}