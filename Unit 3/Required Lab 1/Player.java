/*
Shaheer Khan
On my honor as a student, I have not given nor recieved unauthorized assistance on this assignment
*/


public class Player
{
   // private instance variables
   private String name;
   private int treeCherries, bucketCherries;
   private boolean won;
   
   // constructor methods
   public Player(String mane)
   {
      name = mane;
      treeCherries = 10;
      bucketCherries = 0;
   }
   
   // accessor methods
   public String getName()
   {
      return name;
   }
   
   public int getTree()
   {
      return treeCherries;
   }
   
   public int getBucket()
   {
      return bucketCherries;
   }
   
   // boolean method
   public boolean hasWon()
   {
      if (bucketCherries == 10)
      {
         won = true;
      }
      
      else
      {
         won = false;
      }
      
      return won;
   }
   
   // mutator methods
   public void changeBucket(int input)
   {
      bucketCherries += input; 
      if (bucketCherries > 10) // restricts the bucketCherries to <= 10
      {
         bucketCherries = 10;
      }
      if (bucketCherries < 0) // makes bucketCherries >= 0
      {
         bucketCherries = 0;
      }
      treeCherries = 10 - bucketCherries; // makes sure tree + bucket = 10
   }
   
   
   @Override
   public String toString()
   {
      return "Name: " + name + "\n# of Cherries in the Bucket: " + bucketCherries + "\n# of Cherries on the tree: " + treeCherries;
   }
}