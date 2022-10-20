/*
 * Write a program that asks the user’s name, and then greets the user by name.
 * Before outputting the user’s name, convert it to upper case letters. For
 * example, if the user’s name is Fred, then the program should respond “Hello,
 * FRED, nice to meet you!”.
 */

import textio.TextIO;

 class Greeting {

   static public void main (String[] args) {

     /* Declare variable */

     String name; // user's name

     /* Get user's name */

     System.out.print("Please enter your name: ");
     name = TextIO.getln();

     /* Greet user */

     System.out.println("Hello, " + name.toUpperCase() + ", nice to meet you!");

   }

 }
