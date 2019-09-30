
import java.util.ArrayList;

public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World!");

    int integer = 10;
    Integer int2 = 10;

    System.out.println(integer == int2);

    double pi = 3.14;
    boolean bool = true;

    char c = 'c';

    String myString = "this is a string";

    System.out.println(myString);

    int[] ints = { 1, 2, 3, 4, 5 };

    System.out.println(ints);

    for (int i = 0; i < ints.length; i++) {
      System.out.println(ints[i]);
    }

    ArrayList<Integer> array = new ArrayList<Integer>();

    array.add(integer);
    array.add(16);
    array.add(int2);

    System.out.println(array);

    for (int i = 0; i < array.size(); i++) {
      System.out.println(array.get(i));
    }

    for (int value : array) {
      System.out.println("collection loop " + value);
    }
  }
}
