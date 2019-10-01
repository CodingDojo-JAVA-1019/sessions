
public class Test {
  public static void main(String[] args) {
    Animal animal = new Animal();
    Fox fox = new Fox("Fox");
    Cat cat = new Cat("Cat", 3);

    cat.setNumberOfLegs(4);

    // cat.numberOfLegs;

    animal.setNumberOfLegs(-777);

    animal.setType("Horse");

    System.out.println(animal.getNumberOfLegs());
    System.out.println(animal.getType());
    System.out.println(fox.getType());
    cat.run();
    System.out.println(cat.getNumberOfLegs());

    // animal.run();
  }
}