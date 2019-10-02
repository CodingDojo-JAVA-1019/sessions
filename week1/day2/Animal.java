
public abstract class Animal implements IAnimal {
  protected int numberOfLegs;
  private String type;

  public Animal(String type, int numberOfLegs) {
    this.numberOfLegs = numberOfLegs;
    this.type = type;
  }

  public Animal(String type) {
    this.type = type;
    this.numberOfLegs = 4;
  }

  public Animal() {

  }

  public int getNumberOfLegs() {
    return this.numberOfLegs;
  }

  public void setNumberOfLegs(int numberOfLegs) {
    if (numberOfLegs < 0) {
      // do something
      numberOfLegs = 0;
    }

    this.numberOfLegs = numberOfLegs;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}