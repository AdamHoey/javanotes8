/*
 * Which integer between 1 and 10000 has the largest number of divisors, and how
 * many divisors does it have? Write a program to find the answers and print out
 * the results. It is possible that several integers in this range have the
 * same, maximum number of divisors. Your program only has to print out one of
 * them. An example in Subsection 3.4.2 discussed divisors. The source code for
 * that example is CountDivisors.java.
 * You might need some hints about how to find a maximum value. The basic idea
 * is to go through all the integers, keeping track of the largest number of
 * divisors that you’ve seen so far. Also, keep track of the integer that had
 * that number of divisors.
 */

/**
 * This program determines which integer between 1 and 10000 has the largest
 * number of divisors, then reports that integer and the number of divisors
 * it has to the user. If more than one integer has the same maximum value of
 * divisors, only the largest integer that has that max number will be printed.
 */

public class MostDivisors {

  public static void main(String[] args) {

    int maxInt = 0, maxDiv = 0; // numbers to be reported to the user
    int divCounter; // keeps track of the number of divisors in each loop

    /* Iterate and test integers and divisors */

    for(int i = 1; i <= 10000; i++) { // iterates through 10000 integers
      divCounter = 0; // (re)initializes the counter for each loop
      for(int d = 1; d <= i; d++) { // iterates through all possible divisors of i
        if ((i % d == 0)) divCounter++;
      }
      if (divCounter >= maxDiv) {
        maxDiv = divCounter;
        maxInt = i;
      }
    } // end for(i) loop

    /* Print results */

    System.out.println("\nThe integer between 1 and 10,000 that has the most");
    System.out.println("divisors (at " + maxDiv + ") is " + maxInt + ".\n");

  } // end main()
} // end class MostDivisors
