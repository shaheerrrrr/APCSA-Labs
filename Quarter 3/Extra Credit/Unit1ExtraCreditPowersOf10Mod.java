/* Shaheer Khan
On my honor, I have not given nor received aid on this lab */

import java.util.*;

public class Unit1ExtraCreditPowersOf10Mod
{
   public static void main(String[] args)
   {
      int num;
      int fullNum;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a number with 4 digits: ");
      num = input.nextInt();
      fullNum = num;
            
      //calculations
      int thousands = (num / 1000) * 1000;
      num -= thousands;
      
      int hundreds = (num / 100) * 100;
      num -= hundreds;
      
      int tens = (num / 10) * 10;
      num -= tens;
      
      //fullNum print
      if (thousands != 0)
      {
         System.out.print(fullNum + " = ");
      }
      else if (thousands == 0 && fullNum > 0)
      {
         System.out.print("0" + fullNum + " = ");
      }
      else if (thousands == 0 && fullNum < 0)
      {
         System.out.print("-0" + -1 * fullNum + " = -");
      }
      
      //thousands place
      if (thousands != 0 && fullNum > 0)
      {
         System.out.print(thousands + " + ");
      }
      else if (thousands != 0 && fullNum < 0)
      {
         System.out.print(thousands + " - ");
      }
      
      //hundreds place
      
      if (hundreds > 0)
      {
         System.out.print(hundreds + " + ");
      }
      else if (hundreds < 0)
      {
         System.out.print(-1 * hundreds + " - ");
      }
      
      //tens place
      if (tens > 0)
      {
         System.out.print(tens + " + ");
      }
      else if (tens < 0)
      {
         System.out.print(-1 * tens + " - ");
      }
      
      //ones place
      
      if (num > 0)
      {
         System.out.print(num);
      }
      else if (num < 0)
      {
         System.out.print(-1 * num);
      }
   }
}