/*
 * Write a program that simulates rolling a pair of dice. You can simulate
 * rolling one die by choosing one of the integers 1, 2, 3, 4, 5, or 6 at random.
 * The number you pick represents the number on the die after it is rolled. As
 * pointed out in Section 2.5, the expression
 *          (int)(Math.random()*6) + 1
 * does the computation to select a random integer between 1 and 6. You can
 * assign this value to a variable to represent one of the dice that are being
 * rolled. Do this twice and add the results together to get the total roll.
 * Your program should report the number showing on each die as well as the
 * total roll. For example:
 *          The first die comes up 3
 *          The second die comes up 5
 *          Your total roll is 8
 */

public class RollDice {

  public static void main(String[] args) {

    /* declare variables */

    int roll1, roll2;

    /* roll the dice */

    roll1 = (int)(Math.random()*6) + 1;
    roll2 = (int)(Math.random()*6) + 1;

    /* print the results */

    System.out.println("First roll:  " + roll1);
    System.out.println("Second roll: " + roll2);
    System.out.println("Total roll:  " + (roll1 + roll2));

  }
  
}
