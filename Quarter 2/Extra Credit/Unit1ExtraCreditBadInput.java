/*
Shaheer Khan
On my honor as a student, I have not given nor recieved unauthorized assistance on this assignment
*/
import java.util.*;
public class Unit1ExtraCreditBadInput
{
   public static void main(String[] args)
   {
      Scanner input;
      input = new Scanner(System.in);
      int red;
      int blue;
      int black;
      int yellow;
      int pink;
      //creating variables
      
      System.out.println("Enter an Integer");
      
      while(!(input.hasNextInt())) // input.hasNextInt() asks if the input is an int
      {
      System.out.println("give me int");
      input.next(); // moved the cursor
      }
      
      red = input.nextInt();
      
      
      System.out.println("Enter another integer");
      
      while(!(input.hasNextInt()))
      {
      System.out.println("give me int");
      input.next();
      }

      blue = input.nextInt();
   
   
      System.out.println("Enter a third integer");
      
      while(!(input.hasNextInt()))
      {
      System.out.println("give me int");
      input.next();
      }

      black = input.nextInt();
   
   
      System.out.println("Enter a fourth integer");
      
      while(!(input.hasNextInt()))
      {
      System.out.println("give me int");
      input.next();
      }

      yellow = input.nextInt();
   
      System.out.println("Enter a final integer");
      while(!(input.hasNextInt()))
      {
      System.out.println("give me int");
      input.next();
      }

      pink = input.nextInt();
      //defining all variables
      
      int r1 = red + blue;
      int r2 = r1 - black;
      int r3 = r2 * yellow;
      int r4 = r3 / pink;
      //defining results
      
      System.out.println(red + " + " + blue + " = " + r1);
      System.out.println(r1 + " - " + black + " = " + r2);
      System.out.println(r2 + " * " + yellow + " = " + r3);
      System.out.println(r3 + " / " + pink + " = " + r4);
      
      
   }
}
