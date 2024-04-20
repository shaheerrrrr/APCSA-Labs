/*
Shaheer Khan
On my honor as a student, I have not given nor recieved unauthorized assistance on this assignment
*/

public class SlotReel
{
   private int value;
   private String result;
   
   public SlotReel()
   {
      value = 0;
      result = "";
   }
   public int spin()
   {
      value = (int)(Math.random() * 6) + 1;
      
      return value;
   }
   
   public boolean equals(int a)
   {
      return a == value;
   }

   public boolean equals(SlotReel slot)
   {
      return slot.equals(value);
   }
   
   public boolean equals(String str)
   {
      return str.equals(toString());
   }
   
   @Override
   public String toString()
   {
      if (value == 1)
      {
         result = "diamond";
      }
      
      else if (value == 2)
      {
         result = "heart";
      }
      
      else if (value == 3)
      {
         result = "spade";
      }
      
      else if (value == 4)
      {
         result = "horseshoe";
      }
      
      else if (value == 5)
      {
         result = "star";
      }
      
      else
      {
         result = "LIBERTY BELL";
      }
      
      return result;
   }
}