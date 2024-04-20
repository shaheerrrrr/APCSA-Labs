public class RockCollectionExample
{
   public static void main(String[] args)
   {
      Rock r1 = new Rock(); // calls the constructer with 0 restrictions
      Rock r2 = new Rock("sedimentary", "green", 3.5); // calls the constructer with 3 restrictions
      Rock r3 = new Rock("sandstone", "black", 5.8);
      Rock r4 = new Rock("igneous", "brown", 3.5);
      Rock r5 = r3.divide();
      Rock r6 = r3.divide();
      
      System.out.println("r1's group is " + r1.getGroup());
      System.out.println("r2's group is " + r2.getGroup());
      System.out.println("r3's group is " + r3.getGroup());
      System.out.println("r4's group is " + r4.getGroup());
      
      
      r3.paint("blue and red");
      System.out.println("r3's painted color is: " + r3.getPaint());
      r4.paint("pink and purple");
      System.out.println("r4's painted color is: " + r4.getPaint());
      
      System.out.println("r5's weight is " + r5.getWeight());
      System.out.println("r6's weight is " + r6.getWeight());
      System.out.println("r5's weight is " + r5.getWeight()); //shows that r5 was not modified and stayed at 1/2 of r3
      System.out.println("r3's weight is " + r3.getWeight());
      System.out.println(r1); //Same as System.out.println(r1.toString());
      System.out.println(r2);
      System.out.println(r3);
      System.out.println(r4);
      System.out.println(r5);
      System.out.println(r6);
   }
}//end of RockCollection