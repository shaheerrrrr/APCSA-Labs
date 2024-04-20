/* Shaheer Khan
On my honor as a student, I have not given recieved unauthorized aid on this assignment */

import java.util.*;

public class Unit2Lab2MultiplicationTables
{
   public static void main(String[] args)
   {
   
   // inputting number
   
      Scanner input = new Scanner(System.in);
            
      for (int u = 0; u < 1; u--)
      {
         System.out.println("give me el numbre. if numbre is 0 then we finish");
         int multNum = input.nextInt();
         if (multNum == 0)
         {
            u = 10;
            System.out.println("bye bye");
         } // end of if
         else
         {
            for (int i = 0; i<= Math.abs(multNum); i++)
            {
               System.out.println(i + " x " + multNum + " = " + i * multNum);
            } // end of other for loop
         } // end of else
      } // end of for loop
   } //end of main
} // end of public