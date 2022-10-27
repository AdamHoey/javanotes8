/*
 * How many times do you have to roll a pair of dice before they come up snake
 * eyes? You could do the experiment by rolling the dice by hand. Write a
 * computer program that simulates the experiment. The program should report
 * the number of rolls that it makes before the dice come up snake eyes. (Note:
 * “Snake eyes” means that both dice show a value of 1.) Exercise 2.2 explained
 * how to simulate rolling a pair of dice.
 */

/**
 * This program will simulate rolling a pair of dice multiple times until
 * the dice come up "snake eyes," then report the number of rolls required.
 */
import textio.TextIO;

public class SnakeEyes {

  public static void main(String[] args) {

    int roll1, roll2, counter;
    boolean rollAgain = true;

    /* Introduce the program to the user */

    System.out.println("\nThis program will simulate and count the number of");
    System.out.println("rolls of a pair of dice until they come up \"snake");
    System.out.println("eyes.\"");

    while (rollAgain) {

      roll1 = roll2 = counter = 0; // (re)initialize variables and prime the loop
      System.out.println();

      /* Simulate dice rolls until "snake eyes" comes up */

      while((roll1 + roll2) != 2) {
        counter++;
        System.out.print('.');
        roll1 = (int)(Math.random()*6) + 1;
        roll2 = (int)(Math.random()*6) + 1;
      }

      /* Report the number of rolls and offer to run again */

      System.out.println("\n\nThe number of rolls until \"snake eyes\" came up was "
        + counter + "!");
      System.out.print("Would you like to run the experiment again? (y/n) :");
      rollAgain = TextIO.getlnBoolean();
    }
    System.out.println("\nOK. See you next time!\n");

  } // end main()
} // end class SnakeEyes
