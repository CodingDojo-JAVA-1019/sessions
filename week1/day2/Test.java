
public class Test {
  public static void main(String[] args) {
    Horse animal = new Horse();
    Fox fox = new Fox("Fox");
    Cat cat = new Cat("Cat", 3);

    cat.setNumberOfLegs(4);

    // cat.numberOfLegs;

    animal.setNumberOfLegs(-777);

    animal.setType("Cat");

    System.out.println(animal.getNumberOfLegs());
    System.out.println(animal.getType());
    System.out.println(fox.getType());
    cat.run();
    System.out.println(cat.getNumberOfLegs());

    // cat.makeSound();?
    // fox.makeSound()
    Human human = new Human();
    Parrot parrot = new Parrot();

    Trainer.train(fox);
    Trainer.train(cat);
    Trainer.train(animal);
    Trainer.train(human);
    // Trainer.train((IAnimal) parro

  }
}