public class Algoithm
{
   public static void scamble(int[] arr)
   {
      for (int i = 0; i < arr.length; i++)
      {
         int random = (int)(Math.random() * arr.length);
         int temp = arr[i];
         arr[i] = arr[random];
         arr[random] = temp;
      }
   }
   
   public static void revese(int[] arr)
   {
      int end = arr.length - 1;
      for(int i = 0; i < arr.length/2; i++)
      {
         
      }
   }
   
   public static int[] palindrome(int[] arr)
   {
      int[] pals = new int[arr.length * 2 - 1];
      
      for (int i = 0; i < arr.length; i++)
      {
         pals[i] = arr[i];
      }
      
      for (int i = arr.length -2; i >= 0; i--)
      {
         pals[pals.length - 1 - i] = arr[i];
      }
      
      return pals;
   }
   
   public static int[] altnate(int[] arr)
   {
      int[] alt = new int[arr.length];
      
      for (int i = 0; i < arr.length; i++)
      {
         if (i % 2 == 0)
         {
            alt[i] = arr[i/2];
         }
         else
         {
            alt[i] = arr[(arr.length - 1)/ 2];
         }
      }
      
      return alt;
   }
}