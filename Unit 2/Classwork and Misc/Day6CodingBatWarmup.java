import java.util.*;

public class Day6CodingBatWarmup
{
   public static void main(String[] args)
   {
   
      boolean bobBool;
      Scanner input = new Scanner(System.in);
      System.out.println("give me a string");
      String bobThere = input.nextLine();
   
      String bobHere = bobThere.substring(bobThere.indexOf("b"), bobThere.indexOf("b") + 3);
   
      if (bobHere.substring(bobHere.length()-1, bob.length()).equalsIgnoreCase("b"))
      {
      bobBool = true;
      System.out.println(bobBool);
      }
      else
      {
      bobBool = false;
      System.out.println(bobBool);
      }
   }
}