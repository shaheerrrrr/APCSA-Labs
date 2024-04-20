/*
Shaheer Khan
On my honor as a student, I have not given nor received unauthorized assistance on this project
*/

import java.util.*;


public class Unit1Project
{
   public static void main(String[] args)
   {
      // adj to describe bobs brother
      Scanner input = new Scanner(System.in);
      System.out.println("give me an adjective");
      String adj = input.nextLine();
      
      //bobs brothers name
      System.out.println("give a name");
      String name = input.nextLine();
      
      // num of animal1
      System.out.println("give a number");
      int numAnimal1 = input.nextInt();
      
      //essay length
      System.out.println("give me a double (decimal)");
      float boudle = input.nextFloat();
      
      //animals
      System.out.println("give 2 plural animals in (animal1, animal2) format");
      String animals = input.nextLine();
      animals = input.nextLine();
      
      double essayLength = (numAnimal1)/(boudle);
      String animal1 = animals.substring(0, animals.indexOf(","));
      String animal2 = animals.substring((animals.indexOf(",") + 1));
      
      System.out.println("Bob was having a normal day, until his " + (int)(boudle) + " " + adj + " brothers\n" + name.toUpperCase() + " stepped on his " + numAnimal1 + " pet " + animal1.toUpperCase() + ". "
      + "He forced his brother to write a \n" + essayLength + " page apology letter to him to help him grieve\nfor his " + animal1.toUpperCase() + ". "
      + "Bob's remaining pet" + animal2.toUpperCase() + " were then afraid of his brother\nand lived in fear of getting stepped on.");
   }
}