public class HiddenWord // +1 bc of lines 1, 5, 10
{
   private String puzzle; // +1
   
   public HiddenWord(String andrew)
   {
      puzzle = andrew; // +1
   }
   
   public String getHint(String guess)
   {
      for (int i = 0; i < guess.length(); i++) // +1 for correct for loop
      {
         if (guess.substring(i, i+1).equals(puzzle.substring(i, i+1))) // +1 for correct .equals() method; +1 for correct if statement
         {
            return guess.substring(i, i+1); 
         }
      }
   }
}