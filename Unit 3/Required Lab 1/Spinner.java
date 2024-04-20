/*
Shaheer Khan
On my honor as a student, I have not given nor recieved unauthorized assistance on this assignment
*/

public class Spinner
{
   private static String message;
   private static int result, spin;
   
   public static int spin()
   {
      spin = (int)(Math.random() * 7) + 1;
      
      if (spin == 1)
      {
         message = "1, Take 1 cherry from the tree.";
      
         result = 1;
         return result;
      }
      
      else if (spin == 2)
      {
         message = "2, Take 2 cherries from the tree.";
         
         result = 2;
         return result;
      }
      
      else if (spin == 3)
      {
         message = "2, Take 3 cherries from the tree.";
         
         result = 3;
         return result;
      }
      
      else if (spin == 4)
      {
         message = "4, take 4 cherries from the tree.";
         
         result = 4;
         return result;
      }
      
      else if (spin == 5)
      {
         message = "5, Oh no, a dog has come and eaten some of your cherries. Put 3 cherries back on your tree.";
         
         result = -3;
         return result;
      }
      
      else if (spin == 6)
      {
         message = "6, Oh no, a bird has come and eaten some of your cherries. Put 2 cherries back on the tree.";
         
         result = -2;
         return result;
      }
      
      else
      {
         message = "7, Oh no, your basket spilled! put all of your cherries back on the tree.";
         
         result = -10;
         return result;
      }
   }
   
   public static String getMessage()
   {
      return message;
   }
} // end of class