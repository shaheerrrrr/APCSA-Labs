public class Elevator
{
   private int top, current, passengers, capacity;
   
   public Elevator()
   {
      top = 15;
      current = 1;
      passengers = 0;
      capacity = 50;
   }
   
   public Elevator(int tope, int cap)
   {
      top = tope;
      current = 1;
      passengers = 0;
      capacity = cap;
   }
   
   public void letOff(int off)
   {
      
      if (passengers < 0)
      {
         System.out.println("no");
      }
      else
      {
         passengers -= off;
      }
   }
   
   public void letOn(int on)
   {
      
      if (passengers > capacity)
      {
         System.out.println("too many people");
      }
      else
      {
         passengers += on;
      }
   }
   
   public void moveUp(int up)
   {
      
      if (current > top)
      {
         System.out.println("u too high");
      }
      else
      {
         current += up;
      }
   }
   
   public void moveDown(int down)
   {
      current -= down;
   }
   
   @Override
   public String toString()
   {
      return "Elevator is Currently on Floor: " + current + "\nThe Top Floor is Floor: " + top + "\n# of Passengers: " + passengers + "\nMax Capacity: " + capacity;
   }
}