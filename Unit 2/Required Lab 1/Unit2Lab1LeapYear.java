/* Shaheer Khan
On my honor as a student, I have not recieved unauthorized assistance on this assignment */

import java.util.*;

public class Unit2Lab1LeapYear
{
   public static void main(String[] args)
   {
   
   // inputting Leap Year
      Scanner input = new Scanner(System.in);
      System.out.println("give me a year");
      int year = input.nextInt();
      
   // creating variables and booleans
      
      int YearMod1 = year - 1;
      int YearMod3 = year + 1;
      int Year1 = year + 3;
      int Year99 = year - 3;
      int YearPlus1 = year + 1;
      int YearMinus1 = year - 1;
      int Pos1 = 1;
      int Neg1 = -1;
      int randomLeap = new Random().nextBoolean() ? Pos1 : Neg1; // i was able to learn this from my friend from TJ
   
   //if statements
      if (year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0)
      {
         System.out.println(year + " is a leap year.");
      } // end of if
      
      else if (year % 4 == 1)
      {
         if ((year % 100 == 1) && !(YearMinus1 % 400 == 0))
         {
            System.out.println(year + " is not a leap year. The closest leap year to " + year + " is " + Year1);
         }
         
         else
         {
            System.out.println(year + " is not a leap year. The closest leap year to " + year + " is " + YearMod1);
         }
      } // end of else if
      
      else if (year % 4 == 3)
      {
         if ((year % 100 == 99) && !(YearPlus1 % 400 == 0))
         {
            System.out.println(year + " is not a leap year. The closest leap year to " + year + " is " + Year99);
         }
         
         else
         {
            System.out.println(year + " is not a leap year. The closest leap year to " + year + " is " + YearMod3);
         }
      } //end of else if again
      
      else if (year % 100 == 0 && !(year % 400 == 0))
      {
         System.out.println(year + " is not a leap year. The closest leap year to " + year + " is " + (year + (4 * randomLeap)));
      } // end of else if 3
      
      else if (year % 4 == 2) // same as else if 3 but with different numbers
      {
         System.out.println(year + " is not a leap year. The closest leap year to " + year + " is " + (year + (2 * randomLeap)));
      } // end of else if 4
   } // end of main
} // end of class