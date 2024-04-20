/*
Shaheer Khan
On my honor as a student, I have not given nor recieved unauthorized assistance on this assignment
*/

import java.util.*;
public class Client
{
   public static void main(String[] args)
   {
      Spinner s1 = new Spinner();
      
      Player p1 = new Player("Brian");
      Player p2 = new Player("Ada");
      
      for (int i = 0; i < 1; i--)
      {
         int cherriesWon = Spinner.spin();
         p1.changeBucket(cherriesWon);
         System.out.println(p1.getName() + " spins: " + Spinner.getMessage());
         System.out.println("Tree Cherries: " + p2.getTree());
         System.out.println("Bucket Cherries: " + p2.getBucket() + "\n \n");
         
         if (p1.hasWon())
         {
            System.out.println(p1.getName() + " wins!");
            i = 10;
         }
         if (!(p1.hasWon()))
         {
            p2.changeBucket(cherriesWon);
            System.out.println(p2.getName() + " spins: " + Spinner.getMessage());
            System.out.println("Tree Cherries: " + p2.getTree());
            System.out.println("Bucket Cherries: " + p2.getBucket() + "\n \n");
         }
         
         if (p2.hasWon())
         {
            System.out.println(p2.getName() + " wins!");
            i = 10;
         }
      }
   }
}