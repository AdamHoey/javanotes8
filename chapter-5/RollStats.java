/*
This problem uses the PairOfDice class from Exercise 5.1 and the StatCalc class
from Exercise 5.2.
The program in Exercise 4.4 performs the experiment of counting how many times a
pair of dice is rolled before a given total comes up. It repeats this experiment
10000 times and then reports the average number of rolls. It does this whole
process for each possible total (2, 3, ..., 12).
Redo that exercise. But instead of just reporting the average number of rolls,
you should also report the standard deviation and the maximum number of rolls.
se a PairOfDice object to represent the dice. Use a StatCalc object to compute
the statistics. (You’ll need a new StatCalc object for each possible total, 2,
3, ..., 12. You can use a new pair of dice if you want, but it’s not required.)
*/

import textio.TextIO;

public class RollStats {

  static final int NUM_OF_EXPERIMENTS = 10000;

  public static void main(String[] args) {

    boolean runAgain = true;

    while (runAgain) {

      System.out.println();
      System.out.println("Total     Avg. Rolls     Std. Dev.     Max Rolls");
      System.out.println("-----     ----------     ---------     ---------");

      for (int rollTotal = 2; rollTotal <= 12; rollTotal++) {
        StatCalcMod calc = new StatCalcMod();
        for (int roll = 0; roll < NUM_OF_EXPERIMENTS; roll++) {
          calc.enter(rollCount(rollTotal));
        }
        System.out.printf("%3d", rollTotal);
        System.out.printf("%15.3f", calc.getMean());
        System.out.printf("%14.3f", calc.getStandardDeviation());
        System.out.printf("%13d", (int)calc.getMax());
        System.out.println();
      }

        System.out.println();
        System.out.print("Run again? (y/n): ");
        runAgain = TextIO.getlnBoolean();
    } // end while

  } // end main()

  static int rollCount(int rollTarget) {

    if ((rollTarget < 2) || (rollTarget > 12))
      throw new IllegalArgumentException( "Target value must be between 2 and 12.");

    int counter = 0; // (re)initialize variable, prime the loop
    BetterPairOfDice dice = new BetterPairOfDice();

    /* Simulate dice rolls until value passed to parameter comes up */
    do {
      counter++;
      dice.roll();
    } while((dice.getDie1() + dice.getDie2()) != rollTarget);
    return counter;
  } // end rollCount()

} // end class RollStats
