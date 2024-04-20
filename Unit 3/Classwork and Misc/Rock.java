public class Rock
{
   private String group, naturalColor, paintedColor;
   private double weight;
   private static int collectionSize = 0;
   
   public Rock() // constructer with 0 required inputs
   {
      group = "metamorphic";
      naturalColor = "gray";
      paintedColor = "none";
      weight = 0.5;
      collectionSize++;
   } // end of public Rock
   
   public Rock(String type, String nat, double wght) // constructer with 3 required inputs
   {
      group = type;
      naturalColor = nat;
      paintedColor = "none";
      weight = wght;
      collectionSize++;
   }
   
   //Accessor Methods for each instance variable
   
   public static int getCollectionSize()
   {
      return collectionSize;
   }

   public String getGroup()
   {
      return group;
   }
   
   public String getNat()
   {
      return naturalColor;
   }
   
   public String getPaint()
   {
      return paintedColor;
   }
   
   public double getWeight()
   {
      return weight;
   }
   
   public void paint(String color) // mutator method, void returns nothing
   {
      paintedColor = color;
   }
   
   public void breakHalf()
   {
      weight /= 2;
   }
   
   public void chiselAway(double removal)
   {
      if(weight >= removal)
      {
         weight -= removal;
      }
   }
   
   public Rock divide()
   {
      weight /= 2;
      return new Rock(group, naturalColor, weight); //keeps the old values of group, naturalColor and weight
   }
   
   @Override
   public String toString()
   {
      return "\nRock Group: " + group +
         "\nNatural Color: " + naturalColor +
         "\nPainted Color: " + paintedColor +
         "\nWeight: " + weight + " pounds\n\n" +
         "\nTotal Rocks in Collection: " + collectionSize;
   }
} // end of Rock class