/*
Problem 2:
The hexadecimal digits are the ordinary, base-10 digits ’0’ through ’9’ plus the
letters ’A’ through ’F’. In the hexadecimal system, these digits represent the
values 0 through 15, respectively. Write a function named hexValue that uses a
switch statement to find the hexadecimal value of a given character. The
character is a parameter to the function, and its hexadecimal value is the
return value of the function. You should count lower case letters ’a’ through
’f’ as having the same value as the corresponding upper case letters. If the
parameter is not one of the legal hexadecimal digits, return -1 as the value of
the function.
A hexadecimal integer is a sequence of hexadecimal digits, such as 34A7, ff8,
174204, or FADE. If str is a string containing a hexadecimal integer, then the
corresponding base-10 integer can be computed as follows:

value = 0;
for(i=0;i<str.length(); i++)
    value = value*16 + hexValue( str.charAt(i) );

Of course, this is not valid if str contains any characters that are not
hexadecimal digits. Write a program that reads a string from the user. If all
the characters in the string are hexadecimal digits, print out the corresponding
base-10 value. If not, print out an error message.
*/

/**
<H1>Hexadecimal to Base-10 Conversion Utility</H1>

<H3>Purpose and Description</H3>
<P>
This program converts a hexidecimal value input by the user to its base-10
equivalent.
</P>
*/

import textio.TextIO;

public class HexConverter {

  public static void main(String[] args) {

    boolean response = true;

    mainloop : while (response) {
      String hexInput = ""; // (re)initialize user-input String
      int value = 0;      // (re)initialize int to hold base-10 conversion
      System.out.println();
      System.out.print("Enter hexideximal integer for conversion to base-10: ");
      hexInput = TextIO.getln().toLowerCase();

      for (int i = 0; i < hexInput.length(); i++) {
        if ( hexValue(hexInput.charAt(i)) == -1 ) {
          System.out.println("Invalid value! Try again.");
          continue mainloop; // restart the process
        }
        else
          value = (value * 16) + hexValue(hexInput.charAt(i));
      }

      System.out.println();
      System.out.println("The hex value " + hexInput + " is equivalent to the"
        +" base-10 value " + value );
      System.out.println();
      System.out.print("Convert another? (Y/N): ");
      response = TextIO.getlnBoolean();

    } //end while
    System.out.println("Thank you. Good bye.");
    System.out.println();
  } // end main()

  /**
  This subroutine converts and returns the base-10 value of a single hexidecimal
  digit, or returns -1 if an invalid input is encountered. The hexidecimal digit
  can be upper or lower case.
  @param hexDigit the char representing the hexidecimal digit
  @return the base-10 equivalent of the hexidecimal digit
  */
  static int hexValue(char hexDigit) {
    switch(hexDigit) {
      case '0' : return 0;
      case '1' : return 1;
      case '2' : return 2;
      case '3' : return 3;
      case '4' : return 4;
      case '5' : return 5;
      case '6' : return 6;
      case '7' : return 7;
      case '8' : return 8;
      case '9' : return 9;
      case 'a' : return 10;
      case 'b' : return 11;
      case 'c' : return 12;
      case 'd' : return 13;
      case 'e' : return 14;
      case 'f' : return 15;
      default  : return -1;
    }
  } // end hexValue()

} // end class HexConverter
