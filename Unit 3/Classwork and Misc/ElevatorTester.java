public class ElevatorTester
{
   public static void main(String[] args)
   {
      Elevator e1 = new Elevator(5, 8);
      Elevator e2 = new Elevator(20, 12);
      
      
      //Display the initial elevators
      //both elevators are on floor 1 with 0 passengers
      System.out.println(e1);
      System.out.println(e2);
      
      e1.moveUp(12);  //test moving up too many floors
      e2.moveUp(12);
      
      e1.letOn(7);
      e2.letOn(15); //test letting on too many passengers
      
      //Display the updated elevators
      //e1 is on floor 5 with 7 passengers
      //e2 is on floor 13 with 12 passengers
      System.out.println(e1);
      System.out.println(e2);
      
      e1.moveDown(6); //test moving down too many floors
      e2.moveDown(5);
      
      e1.letOff(8);  //test letting off too many passengers
      e2.letOff(1);
      
      //Display the updated elevators
      //e1 is on floor 1 with 0 passengers
      //e2 is on floor 8 with 11 passengers
      System.out.println(e1);
      System.out.println(e2);
   }
}