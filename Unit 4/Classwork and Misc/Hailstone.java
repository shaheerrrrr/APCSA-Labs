public class Hailstone
{
   private int number;
   
   public Hailstone()
   {
      number = (int)(Math.random() * 100 + 1);
   }
   
   public Hailstone (int ger)
   {
      number = ger;
      doSequence();
   }
   
   public int getNumber()
   {
      return number;
   }
   
   public void doSequence()
   {
      if (number % 2 == 0)
      {
         number /= 2;
      }
      else
      {
         number *= 3;
         number++;
      }
   }
   
   public String toString()
   {
      return number + "";
   }
}