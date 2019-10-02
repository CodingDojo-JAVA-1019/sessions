import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Puzzle {
  // Create an array with the following values: 3,5,1,2,7,9,8,13,25,32.
  // Print the sum of all numbers in the array.
  // Also have the function return an array that only includes numbers that are
  // greater than 10
  // (e.g. when you pass the array above, it should return an array with the
  // values of 13,25,32)

  public ArrayList<Integer> printSum(int[] numbers) {
    ArrayList<Integer> overTen = new ArrayList<Integer>();
    // loop and sum, collect vaalues over ten
    int sum = 0;

    for (int index = 0; index < numbers.length; index++) {
      int value = numbers[index];
      sum += value;

      System.out.println("value is " + value + " sum is " + sum);

      if (value > 10) {
        overTen.add(value);
      }

    }

    System.out.println("Our final sum is " + sum);
    return overTen;
  }

  // Create an array with the following values: Nancy, Jinichi, Fujibayashi,
  // Momochi, Ishikawa.
  // Shuffle the array and print the name of each person. Have the method also
  // return an array with names that are
  // longer than 5 characters.

  public ArrayList<String> shuffleNames(ArrayList<String> names) {
    ArrayList<String> greaterThanFive = new ArrayList<String>();

    // shuffle
    Collections.shuffle(names);

    System.out.println(names);
    // loop and collect names greater than 5

    for (int index = 0; index < names.size(); index++) {
      String name = names.get(index);

      // System.out.println(name);

      if (name.length() > 5) {
        greaterThanFive.add(name);
      }
    }
    // for (String name : names) {
    // System.out.println("Collection loop " + name);
    // if (name.length() > 5) {
    // greaterThanFive.add(name);
    // }
    // }

    return greaterThanFive;
  }

  // Create an array that contains all 26 letters of the alphabet (this array must
  // have 26 values).
  // Shuffle the array and, after shuffling, display the last letter from the
  // array.
  // Have it also display the first letter of the array. If the first letter in
  // the array is a vowel, have it display a message.

  public void alpha() {
    String[] characters = "abcdefghijklmnopqrstuvwxyz".split("");
    System.out.println(Arrays.asList(characters));

    Collections.shuffle(Arrays.asList(characters));

    System.out.println(Arrays.asList(characters));

    // display first char
    String firstChar = characters[0];
    System.out.println("The first character is " + firstChar);
    // display last char from array
    System.out.println("The last character is " + characters[characters.length - 1]);

    // boolean isVowel = isVowel(firstChar);
    // if ()

    // if (isVowel) {
    if (isVowel(firstChar)) {
      // if true
      System.out.println("The first char was a vowel " + firstChar);
    }

  }

  // Generate and return an array with 10 random numbers between 55-100 and have
  // it be sorted (showing the smallest number in the beginning). Display all the
  // numbers in the array. Next, display the minimum value in the array as well as
  // the maximum value.
  public int[] tenRandom() {
    int[] tenRand = new int[10];

    final int min = 55;
    final int max = 100;

    for (int index = 0; index < tenRand.length; index++) {
      int randNumber = rand(min, max);

      System.out.println("Random value generated " + randNumber);
      tenRand[index] = randNumber;
    }

    return tenRand;
  }

  public ArrayList<Integer> sortedTen() {
    int[] ten = tenRandom();
    ArrayList<Integer> list = new ArrayList<Integer>(ten.length);

    for (int number : ten) {
      list.add(number);
    }

    Collections.sort(list);

    return list;
  }

  private int rand(int min, int max) {
    Random rand = new Random();

    return rand.nextInt(max - min) + min;
  }

  private boolean isVowel(String charr) {
    String[] vowels = { "a", "e", "i", "o", "u" };

    // search for vowel
    for (int index = 0; index < vowels.length; index++) {
      String current = vowels[index];

      System.out.println("current value is " + current);
      System.out.println("is equal " + current.equals(charr));

      if (current.equals(charr)) {
        return true;
      }
    }

    return false;
  }

}