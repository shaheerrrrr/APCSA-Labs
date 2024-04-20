public class APLine
{
   private int a, b, c;
   private int x, y;
   private double sloop;
   
   public APLine(int a1, int b1, int c1)
   {
      a = a1;
      b = b1;
      c = c1;
   }
   
   public double getSlope()
   {
      sloop = (-1 * a)/(b);
      return sloop;
   }
   
   public boolean voible(boolean bwy)
   {
      if (((a * x) + (b * y) + c) == 0)
      {
         System.out.println("Yes because " + a + "(" + x + ") + " + b + "(" + y + "( + " + c + ") = 0");
         bwy = true;
      }
      else
      {
         System.out.println("No because " + a + "(" + x + ") + " + b + "(" + y + "( + " + c + ") ≠ 0");
         bwy = false;
      }
      return bwy;
   }
}