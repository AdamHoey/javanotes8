/*
PROBLEM 4.3:
 Write a function that simulates rolling a pair of dice until the total on the
 dice comes up to be a given number. The number that you are rolling for is a
 parameter to the function. The number of times you have to roll the dice is
 the return value of the function. The parameter should be one of the possible
 totals: 2, 3, . . . , 12. The function should throw an IllegalArgumentException
  if this is not the case. Use your function in a program that computes and
  prints the number of rolls it takes to get snake eyes. (Snake eyes means that
  the total showing on the dice is 2.)
 */

/**
 * This program will simulate rolling a pair of dice multiple times until
 * the dice come up "snake eyes," then report the number of rolls required.
 */

 import textio.TextIO;

public class SnakeEyes2 {

  static final int SNAKE_EYES = 2;

  public static void main(String[] args) {

    boolean rollAgain = true;
    int inputNum = 0;

    /* Introduce the program to the user */

    System.out.println();
    System.out.println("This program will simulate and count the number of");
    System.out.println("rolls of a pair of dice until they come up \"snake");
    System.out.println("eyes.\" Press return to begin.");
    TextIO.getln();

    while (rollAgain) {

      System.out.println();
      try {
        System.out.println("The number of rolls until \"snake eyes\" came up was "
          + rollCount(SNAKE_EYES) + "!");
      }
      catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
      System.out.print("Would you like to run the experiment again? (y/n) :");
      rollAgain = TextIO.getlnBoolean();
    }
    System.out.println();
    System.out.println("OK. See you next time!");
    System.out.println();

  } // end main()

  /**
  This function simulates rolling a pair of dice and returns the number of rolls
  required to roll the target value passed in as a parameter.
  @param rollTarget the roll value that ends the experiment
  @return the number of rolls required to end the experiment
  @throws IllegalArgumentException if rollTarget is less than 2 or greater than 12
  */
  static int rollCount(int rollTarget) {

    if ((rollTarget < 2) || (rollTarget > 12))
      throw new IllegalArgumentException( "Target value must be between 2 and 12.");

    int roll1, roll2, counter;
    roll1 = roll2 = counter = 0; // (re)initialize variables, prime the loop

    /* Simulate dice rolls until value passed to parameter comes up */
    while((roll1 + roll2) != rollTarget) {
      counter++;
      roll1 = (int)(Math.random()*6) + 1;
      roll2 = (int)(Math.random()*6) + 1;
    }
    return counter;
  } // end rollCount()

} // end class SnakeEyes2
