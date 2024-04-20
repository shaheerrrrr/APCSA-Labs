/*Shaheer Khan
 * On My Honor as a Student, I have not given nor received aid on this lab
 */

public class JuniorMarshalTester{
    public static void main(String[] args){
       JuniorRecords data = new JuniorRecords();
       
       //Add first set of students
       data.addStudent(new Student("Bud", 3.750));
       data.addStudent(new Student("Clay", 3.675));
       data.addStudent(new Student("Alma", 3.881));
       data.addStudent(new Student("Lane", 3.212));
       data.addStudent(new Student("Rodger", 4.000));
       data.addStudent(new Student("Karin", 3.999));
       data.addStudent(new Student("Rosanne", 3.432));
       data.addStudent(new Student("Vernon", 2.996));
       data.addStudent(new Student("Estaban", 3.767));
       
       //Junior marshals include Roodger, Karin, Alma, Estaban, and Bud
       System.out.println("\n\nTest #1: Filter Junior Marshals with GPA of 3.75 or higher\n");
       data.printAll();
       System.out.println();
       data.printJuniorMarshals();
       System.out.println();
       
       data.addStudent(new Student("Rubin", 4.021));
       data.addStudent(new Student("Beryl", 4.022));
       data.addStudent(new Student("Kenton", 3.75));
       data.addStudent(new Student("Colette", 3.659));
       data.addStudent(new Student("Morton", 3.212));
       data.addStudent(new Student("Hubert", 3.985));
       data.addStudent(new Student("Chris", 3.75));
       data.addStudent(new Student("Cesar", 3.75));
       data.addStudent(new Student("Jerold", 3.75));         
       
       //Junior marshals include Beryl, Rubin, Rodger, Karin, Hubert, Alma, Estaban, Jerold, Chris, Kenton, Bud, and Cesar
       System.out.println("\n\nTest #2: Multiple students tied at GPA of 3.75 in 8th rank, list size greater than 10\n");         
       data.printAll();
       System.out.println();
       data.printJuniorMarshals();
       System.out.println();
       
    
       data.addStudent(new Student("Mitchel", 3.819));
       data.addStudent(new Student("Willie", 3.976));
       data.addStudent(new Student("Vilma", 4.333));
       
       //Junior marshals include Vilma, Beryl, Rubin, Rodger, Karin, Hubert, Willie, Alma, Mitchel, and Estaban
       System.out.println("\n\nTest #3: Students with higher GPAs eliminate students with 3.75\n");          
       data.printAll();
       System.out.println();
       data.printJuniorMarshals();
       System.out.println();
       
          
       data.addStudent(new Student("Paul", 3.789));
       data.addStudent(new Student("Alba", 3.820));
       data.addStudent(new Student("Alfonso", 4.286));
       data.addStudent(new Student("Latasha", 3.799));
       data.addStudent(new Student("Tammy", 3.145));
       data.addStudent(new Student("Mitch", 2.985));
       data.addStudent(new Student("Wilson", 3.124));
       data.addStudent(new Student("Kris", 3.820));
       data.addStudent(new Student("Bradley", 3.645));
       
       //Junior marshals include Vilma, Alfonso, Beryl, Rubin, Rodger, Karin, Hubert, Willie, Alma, Alba, Kris
       System.out.println("\n\nTest #4: Final junior marshal list (size 11 due to tie for 10th place)\n");          
       data.printAll();
       System.out.println();
       data.printJuniorMarshals();
       System.out.println();
    
    }
 }