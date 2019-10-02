import java.util.ArrayList;
import java.util.Arrays;

public class PuzzleTest {
  public static void main(String[] args) {
    Puzzle puzzle = new Puzzle();

    int[] numbers = { 25, 3, 5, 1, 2, 7, 9, 8, 13, 32 };

    ArrayList<Integer> overTen = puzzle.printSum(numbers);

    System.out.println("Values over 10");
    System.out.println(overTen);

    ArrayList<String> names = new ArrayList<String>();

    // Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa
    names.add("Nancy");
    names.add("Jinichi");
    names.add("Fujibayashi");
    names.add("Momochi");
    names.add("Ishikawa");
    names.add("Sally");
    names.add("Bob");

    ArrayList<String> namesOverFiveChars = puzzle.shuffleNames(names);

    System.out.println("Names greater than 5");
    System.out.println(namesOverFiveChars);

    puzzle.alpha();

    // not visible
    // puzzle.isVowel("f");

    // int[] rands = puzzle.tenRandom();

    // System.out.println(Arrays.asList(rands));

    // for (int num : rands) {
    // System.out.println("Random number is " + num);
    // }

    ArrayList<Integer> numberList = puzzle.sortedTen();

    System.out.println("Sorted 10");
    System.out.println(numberList);
  }
}