/*
EXERCISE 5.1(b - class test):
In all versions of the PairOfDice class in Section 5.2, the instance variables
die1 and die2 are declared to be public. They really should be private, so that
they would be protected from being changed from outside the class. Write another
version of the PairOfDice class in which the instance variables die1 and die2
are private. Your class will need “getter” methods that can be used to find out
the values of die1 and die2. (The idea is to protect their values from being
changed from outside the class, but still to allow the values to be read.)
Include other improvements in the class, including at least a toString() method.
Test your class with a short program that counts how many times a pair of dice
is rolled, before the total of the two dice is equal to two.
*/
import textio.TextIO;

public class BetterPairOfDiceTest {

  static final int SNAKE_EYES = 2;

  public static void main(String[] args) {

    boolean rollAgain = true;

    /* Introduce the program to the user */

    System.out.println();
    System.out.println("This program will simulate and count the number of");
    System.out.println("rolls of a pair of dice until they come up \"snake");
    System.out.println("eyes.\" Press return to begin.");
    TextIO.getln();

    BetterPairOfDice dice = new BetterPairOfDice();

    while (rollAgain) {
      int counter = 0;
      do {
        dice.roll();
        counter++;
      } while ((dice.getDie1() + dice.getDie2()) != SNAKE_EYES);
      System.out.println("The dice are " + dice + " after " + counter
        + " rolls.");
        System.out.print("Roll again? (y/n): ");
        rollAgain = TextIO.getlnBoolean();

    } // end outer while()

    System.out.println();
    System.out.println("OK. See you next time!");
    System.out.println();

  } // end main()

} // end class BetterPairOfDiceTest
