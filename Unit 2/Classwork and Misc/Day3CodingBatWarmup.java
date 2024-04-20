import java.util.*;
public class Day3CodingBatWarmup
{
   public static void main(String[] args)
   {
      // defining
      int chestnuts;
      boolean weekend;
      
      if (weekend == false)
      {
         if (chestnuts >= 40 && chestnuts <= 60)
         {
            System.out.println("party happened");
         }
         else
         {
            System.out.println("party no happened");
         }
      
         if (weekend)
         {
            if (chestnuts >= 40)
            {
               System.out.println("party happen");
            }
            else
            {
               System.out.println("no party");
            }
         } // end of true weekend
      } // end of false weekend
      
      // defining warmup 2
      int you;
      int date;
      int tableResult;
      
      if (you <= 2 || date <= 2)
      {
      tableResult = 0;
      }
      else if (you >= 8 || date >= 8)
      {
      tableResult = 2;
      }
      else
      {
      tableResult = 1;
      }
   } // end of main
} // end of class
