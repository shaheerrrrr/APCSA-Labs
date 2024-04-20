public class HailstoneArrayTester
{
   public static void main(String[] args)
   {
      Hailstone[] gaming = new Hailstone[5];
   
      gaming[0] = new Hailstone();
   
      for (int i = 1; i < gaming.length; i++)
      {
         gaming[i] = new Hailstone(gaming[i-1].getNumber());
      }
      
      for (int u = 0; u < gaming.length; u++)
      {
         System.out.print(gaming[u] + " ");
      }
      
      for (int j = 0; j < gaming.length; j++)
      {
         gaming[j].doSequence();
      }
      
      for (int u = 0; u < gaming.length; u++)
      {
         System.out.print(gaming[u] + " ");
      }
   }
}