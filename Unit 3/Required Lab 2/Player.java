/*
Shaheer Khan
On my honor as a student, I have not given nor recieved unauthorized assistance on this assignment
*/

public class Player
{
   private String name;
   private int money;
   
   // 1-arg constructor method
   public Player(String mane)
   {
      name = mane;
      money = 100;
   }
   
   // accessor method
   public String getName()
   {
      return name;
   }
   
   public int getMoney()
   {
      return money;
   }
   
   // mutator method
   public void setMoney(int moon)
   {
      money = moon;
   }
   
   // toString method
   @Override
   public String toString()
   {
      return name + ", you have " + money + " coins left.";
   }
}