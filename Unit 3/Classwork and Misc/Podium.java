public class Podium
{
   //private instance variables
   private double height, weight;
   private String color, room;
   //public constructors
   public Podium()
   {
      height = 4.0;
      weight = 15.0;
      color = "brown";
      room = "Storage";
   }
   
   public Podium(double tall, double lbs, String clr, String rm)
   {
      height = tall;
      weight = lbs;
      color = clr;
      room = rm;
   }
   //public methods
      //accessors
   public double getWeight()
   {
      return weight;
   }
   
   public String getRoom()
   {
      return room;
   }
   
      //mutators
   public void paint(String clr)
   {
      color = clr;
   }
   
   public void move(String rm)
   {
      room = rm;
      return "the podium got moved to room: " + room;
   }
      //toString
   @Override
   public String toString()
   {
      return "Height: " + height + "\nWeight: " + weight + "\nColor: " + color;
   }
}