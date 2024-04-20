public class HiddenWordSolution
{
   private string puzzle;
   
   public HiddenWordSolution(String word)
   {
      puzzle = word
   }
   
   // puzzle.getHint("AAAAA"; returns "+A+++"
   public String getHint(String guess)
   {
      String hint = "";
      
      for (int i = 0; i < guess.length(); i++)
      {
         String letter = guess.substring(i, i+1);
         if (letter.equals(answer.substring(i, i+1)))
         {
            hint += letter;
         }
         
         else if(answer.indexOf(letter) != -1)
         {
            hint += "+";
         }
         
         else
         {
            hint += "*";
         }
      }
      
      return hint;
   }
}