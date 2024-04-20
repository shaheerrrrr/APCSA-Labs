import java.util.*;

public class InputDemo
{
   public static void main(String[] arg)
   {
      Scanner input = new Scanner(System.in);
      //integers
      System.out.println("give integer pls: ");
      int integger = input.nextInt();
      System.out.println("u chose " + integger + " intejer in meth class");
      System.out.println("hello @bwy");
      //decimals
      System.out.println("enter demical: ");
      double demical = input.nextDouble();
      System.out.println("u chose " + demical + " deciaml");
      //booleans
      System.out.println("enter boolen: ");
      boolean trueFalse = input.nextBoolean();
      System.out.println("u chose boolen value " + trueFalse);
      //strings
      System.out.println("enter string pls: ");
      String wrod = input.next();
      System.out.println("u chose string " + wrod);
      //phrase
      System.out.print("give phrase: ");
      String pharse = input.nextLine();
      System.out.println("u chose phrase " + pharse);
   }//end of main
} //end of InputDemo