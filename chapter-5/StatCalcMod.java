/*
EXERCISE 5.2(a - modified class source code)
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

/**
 * An object of class StatCalc can be used to compute several simple statistics
 * for a set of numbers.  Numbers are entered into the dataset using
 * the enter(double) method.  Methods are provided to return the following
 * statistics for the set of numbers that have been entered: The number
 * of items, the sum of the items, the average, and the standard deviation
 */

public class StatCalcMod {

    private int count;   // Number of numbers that have been entered.
    private double sum;  // The sum of all the items that have been entered.
    private double squareSum;  // The sum of the squares of all the items.
    private double min;   // Smallest item entered
    private double max;   // Largest item entered

    /**
     * Add a number to the dataset.  The statistics will be computed for all
     * the numbers that have been added to the dataset using this method.
     */
    public void enter(double num) {
        count++;
        sum += num;
        squareSum += num*num;
        if(num > max)
          max = num;
        else if (num < min)
          min = num;
    }

    /**
     * Return the value of largest item that was entered.
     */
    public double getMax() {
      return max;
    }

    /**
     * Return the value of the smallest item that was entered.
     */
    public double getMin() {
      return min;
    }

    /**
     * Return the number of items that have been entered into the dataset.
     */
    public int getCount() {
        return count;
    }

    /**
     * Return the sum of all the numbers that have been entered.
     */
    public double getSum() {
        return sum;
    }

    /**
     * Return the average of all the items that have been entered.
     * The return value is Double.NaN if no numbers have been entered.
     */
    public double getMean() {
        return sum / count;
    }

    /**
     * Return the standard deviation of all the items that have been entered.
     * The return value is Double.NaN if no numbers have been entered.
     */
    public double getStandardDeviation() {
        double mean = getMean();
        return Math.sqrt( squareSum/count - mean*mean );
    }

}  // end class StatCalc
