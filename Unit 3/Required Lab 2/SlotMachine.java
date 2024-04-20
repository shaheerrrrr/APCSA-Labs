/*
Shaheer Khan
On my honor as a student, I have not given nor recieved unauthorized assistance on this assignment
*/

public class SlotMachine
{
   private int cost;
   private double multiplier;
   boolean horse2, tih3;

   SlotReel slot1 = new SlotReel();
   SlotReel slot2 = new SlotReel();
   SlotReel slot3 = new SlotReel();
      
   public SlotMachine(int coins)
   {
      cost = coins;
      multiplier = .2 * cost;
   }
   
   public void pull()
   {
      slot1.spin();
      slot2.spin();
      slot3.spin();
   }
   
   public int getCost()
   {
      return cost;
   }
   
   private boolean hit3()
   {
      if ((slot1.equals(slot2) && slot2.equals(slot3)) && (!(slot1.equals("horseshoe")) && !(slot1.equals("star"))))
      {
         tih3 = true;
      }
      else
      {
         tih3 = false;
      }
      return tih3;
   }
   
   private boolean hit2()
   {
      if (slot1.equals(slot2) && (slot1.equals("horseshoe")))
      {
         horse2 = true;
      }
      else
      {
         horse2 = false;
      }
      
      return horse2;
   }
   
   public int calculate()
   {
      double winnings;
      
      if ((slot1.equals(slot2) && slot2.equals(slot3)) && slot1.equals("spade"))
      {
         winnings = multiplier * 20;
      }
      else if ((slot1.equals(slot2) && slot2.equals(slot3)) && slot1.equals("diamond"))
      {
         winnings = multiplier * 30;
      }
      else if((slot1.equals(slot2) && slot2.equals(slot3)) && slot1.equals("heart"))
      {
         winnings = multiplier * 40;
      }
      else if((slot1.equals(slot2) && slot2.equals(slot3)) && slot1.equals("LIBERTY BELL"))
      {
         winnings = multiplier * 50;
      }
      else if(tih3)
      {
         winnings = multiplier * 10;
      }
      else if (horse2 && !(slot3.equals("star")))
      {
         winnings = multiplier * 5;
      }
      else
      {
         winnings = 0;
      }
      
      return (int)winnings;
   }
   
   @Override
   public String toString()
   {
      return "Cost: " + cost + "\nYOUR SPIN:\n" + slot1 + "					" + slot2 + "					" + slot3;
   }
}