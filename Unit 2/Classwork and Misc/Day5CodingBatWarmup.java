import java.util.*;

public class Day5CodingBatWarmup
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
//       System.out.println("give me a word");
//       String first = input.nextLine();
//       
//       System.out.println("give me anotyher word");
//       String second = input.nextLine();
//       String append = "";
//       if (first.substring(first.length() -1).equals (second.substring(0,1)))
//       {
//          append = first + second.substring(1);
//       }
//       else
//       {
//          append = first + second;
//       }
//       System.out.println(append);
   
//       System.out.println("how many odd number would u like to sum?");
//       int numTerms = input.nextInt();
//       int u = 0;
//       System.out.print("The First " + numTerms + " odd numbers are: ");
//       for (int i = 0; i < numTerms; i++)
//       {
//          System.out.print(2 * i + 1 + ", ");
//          u += i * 2 + 1;
//          
//       }
//       System.out.print("\nThe sum of the first " + numTerms + " odd numbers is: " + u);
      
//       System.out.println("give a word");
//       String orig = input.nextLine();
//       String reduced = "";
//       for (int i = 0; i <= orig.length() - 1; i += 2)
//       {
//       reduced += orig.substring(i, i + 1);
//       }
//       System.out.println(reduced);
// 
//       String orig = "xabxxxxcdx";
//       String xsCut = orig.substring(0,1);
//       for (int i = 1; i < orig.length() - 1; i++)
//       {
//          if (!(orig.substring(i, i + 1).equals("x")))
//          {
//             xsCut += orig.substring(i, i + 1);
//          }
//       }
//       xsCut += orig.substring(orig.length() - 1, orig.length());
//       System.out.println(xsCut);
      
      String orig2 = "yakpak";
      String withoutYaks = orig2.substring(0,1);
      for (int i = 1; i < orig2.length() - 2; i++)
      {
         if (orig2.substring(i, i + 3).equals("yak"))
         {
            withoutYaks += orig2.substring(i, i + 1);
         }
      }
      System.out.println(withoutYaks);
   }
}