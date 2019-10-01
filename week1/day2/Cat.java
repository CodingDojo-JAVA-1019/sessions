public class Cat extends Animal {

  public Cat(String type, int numberOfLegs) {
    super(type, numberOfLegs);
  }

  public void run() {
    if (numberOfLegs > 5) {
      System.out.println("This animal runs fast");
    } else {
      System.out.println("This animal runs slow");

    }
  }
}