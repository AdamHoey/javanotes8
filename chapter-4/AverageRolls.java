/*
EXERCISE 4.4:
This exercise builds on Exercise 4.3. Every time you roll the dice repeatedly,
trying to get a given total, the number of rolls it takes can be different. The
question naturally arises, what’s the average number of rolls to get a given
total? Write a function that performs the experiment of rolling to get a given
total 10000 times. The desired total is a parameter to the subroutine. The
average number of rolls is the return value. Each individual experiment should
be done by calling the function you wrote for Exercise 4.3. Now, write a main
program that will call your function once for each of the possible totals
(2, 3, ..., 12). It should make a table of the results, something like:
         Total On Dice     Average Number of Rolls
         -------------     -----------------------
               2                35.8382
               3                18.0607
               .                 .
               .                 .

*/

/**
This program calculates the average number of rolls of a pair of dice required
to get a given total 10,000 times for each possible total from 2 to 12, then
displays the averages in a table.
*/

import textio.TextIO;

public class AverageRolls {

  static final int NUM_OF_EXPERIMENTS = 10000; // number of experiments per run

  public static void main(String[] args) {

    boolean rollAgain = true;

    while (rollAgain) {

      System.out.println();
      System.out.println("Total On Dice     Average Number of Rolls");
      System.out.println("-------------     -----------------------");

      for( int i = 2; i <= 12; i++) { // iterate through all possible totals
        System.out.printf("%8d", i);
        System.out.printf("%22.4f", rollCountAverage(i));
        System.out.println();
      }
      System.out.println();

      System.out.print("Would you like to run the experiment again? (y/n): ");
      rollAgain = TextIO.getlnBoolean();

    } // end while
  } // end main()


  /**
  This function repeats the dice roll experiment the number of times specified
  in the constant NUM_OF_EXPERIMENTS and returns the average rolls to get the
  total over that number of experiments.
  @param rollTotal the target roll value for the set of experiments
  @return the average number of rolls to get the specified total
  */
  static double rollCountAverage(int rollTotal) {
    int runningTotal = 0; // holds sum of all experiments for a given rollTotal

    for (int n = 1; n <= NUM_OF_EXPERIMENTS; n++) {
      runningTotal += rollCount(rollTotal);
    }

    return (double)runningTotal/NUM_OF_EXPERIMENTS;
  } // end rollCountAverage()

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

} // end class AverageRolls
