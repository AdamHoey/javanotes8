/**
 * Write a program that will evaluate simple expressions such as 17 + 3 and
 * 3.14159 * 4.7. The expressions are to be typed in by the user. The input
 * always consists of a number, followed by an operator, followed by another
 * number. The operators that are allowed are +, -, *, and /. You can read the
 * numbers with TextIO.getDouble() and the operator with TextIO.getChar(). Your
 * program should read an expression, print its value, read another expression,
 * print its value, and so on. The program should end when the user enters 0 as
 * the first number on the line.
 */

/*
 * Version 1.0: Constructed using if statements.
 *
 * Version 1.1: Improved cross-platform compatibility for carriage returns.
 *
 * Planned update: Rework using switch statements.
 */

import textio.TextIO;

public class SimpleCalculator {

  public static void main(String[] args) {
    double number1 = -1, number2; // prime the while loop with false condition
    char operator;

    System.out.println();
    System.out.println("Welcome to Adam's SimpleCalculator!");

    /* Get expression from user */

    while (true) {

      System.out.println();
      System.out.println("Enter an expression consisting of two numbers");
      System.out.print("separated by +, -, * or /, OR enter '0' to exit:");
      number1 = TextIO.getDouble();
      if (number1 == 0)
        break;
      operator = TextIO.getChar();
      number2 = TextIO.getDouble();

      /* Perform calculation based on operator and print the result */

      if (operator == '+')
        System.out.println("Your expression evaluates to " + (number1 + number2));
      else if (operator == '-')
        System.out.println("Your expression evaluates to " + (number1 - number2));
      else if (operator == '*')
        System.out.println("Your expression evaluates to " + (number1 * number2));
      else if (operator == '/')
        System.out.println("Your expression evaluates to " + (number1 / number2));
      else
        System.out.println("Invalid operator! Try again.");
    } // end while loop

    System.out.println();
    System.out.println("OK! Until next time.");
    System.out.println();

  } // end main()
} // end class SimpleCalculator
