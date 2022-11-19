/*
EXERCISE 5.2(b - class with main method to test StatCalcMod class)
Modify the current source code, StatCalc.java, to add instance methods getMax() and getMin(). The getMax() method should return the largest of all the items that have been added to the dataset, and getMin() should return the smallest. You will need to add two new instance variables to keep track of the largest and smallest items that have been seen so far.
Test your new class by using it in a program to compute statistics for a set of non-zero numbers entered by the user. Start by creating an object of type StatCalc:
           StatCalc  calc;   // Object to be used to process the data.
           calc = new StatCalc();
Read numbers from the user and add them to the dataset. Use 0 as a sentinel value (that is, stop reading numbers when the user enters 0). After all the user’s non-zero
(solution)
(solution)
Exercises 261 numbers have been entered, print out each of the six statistics that are available from
calc.
*/

import textio.TextIO;

public class StatCalcModTest {
  public static void main(String[] args) {

    System.out.println();
    System.out.println("This program will calculate basic statistics of a set");
    System.out.println("of non-zero numbers. Enter numbers one at a time and");
    System.out.println("use the number '0' to stop the entry routine and have");
    System.out.println("the statistics displayed.");
    System.out.println();

    boolean runAgain = true;

    mainloop: while (runAgain) {
      StatCalcMod calc = new StatCalcMod(); // re-inits all instance variables

      double userInput = -1;
      while (userInput != 0) {
        System.out.print("Enter number: ");
        userInput = TextIO.getlnDouble();
        if(userInput == 0)
          break;
        else
          calc.enter(userInput);
      } // end while

      System.out.println();
      System.out.println("Max:       " + calc.getMax());
      System.out.println("Min:       " + calc.getMin());
      System.out.println("Count:     " + calc.getCount());
      System.out.println("Sum:       " + calc.getSum());
      System.out.println("Mean:      " + calc.getMean());
      System.out.println("Std. Dev.: " + calc.getStandardDeviation());
      System.out.println();

      System.out.print("Enter another set of data? (y/n): ");
      runAgain = TextIO.getlnBoolean();

      System.out.println();
      System.out.println("Ok thx bye.");
      System.out.println();

    } // end mainloop
  } // end main()
} // end StatCalcModTest
