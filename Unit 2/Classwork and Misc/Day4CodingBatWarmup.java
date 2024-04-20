import java.util.*;
public class Day4CodingBatWarmup
{
   public static void main(String[] args)
   {
   
      Scanner input = new Scanner(System.in);
      System.out.println("is it morning");
      boolean isMorning = input.nextBoolean();
         
      System.out.println("are you mom");
      boolean isMom = input.nextBoolean();
         
      System.out.println("are you sleeping");
      boolean isSleeping = input.nextBoolean();
         
      if (isSleeping)
      {
         System.out.println("you will not answer");
      }
      else if (isMorning && isMom)
      {
         System.out.println("you will answer");
      }
      else if (isMorning && !(isMom))
      {
         System.out.println("you will not answer");
      }
      else
      {
         System.out.println("you will answer");
      }
            
      String fizzy = "";
            
      Scanner input = new Scanner(System.in);
      System.out.println("give word");
      String orig = input.nextLine();
            
      if (orig.substring(0,1).equalsIgnoreCase("f"))
      {
         fizzy += "Fizz";
      }
            
      if (orig.substring(orig.length()-1).equalsIgnoreCase("b"))
      {
         fizzy += "Buzz";
      }
      System.out.println(fizzy);
      
      int correct = (int)(Math.random() * 100) + 1;
      System.out.println("guess number");
      int guess = input.nextInt();
      
      while (correct != guess)
      {
         if (guess > correct)
         {
            System.out.println("too high guess again");
         }
         else
         {
            System.out.println("too low quess again");
         }
         guess = input.nextInt();
      }
      System.out.println("u got right");
   }
}