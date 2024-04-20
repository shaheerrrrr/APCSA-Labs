/*Shaheer Khan
 * On My Honor as a Student, I have not given nor received aid on this lab
 */
public class SchoolTester{
    public static void main(String[] args){
       SchoolAssociate[] people = new SchoolAssociate[9];
       people[0] = new SchoolAssociate("Carlos Duarte", 42);
       people[1] = new Staff("Mike Kelley", 36, 45000, 10);
       people[2] = new Administrator("John Bingham", 40, 75000, 8, "English", "Social Studies");
       people[3] = new Teacher("Jerry Dotson", 42, 55000, 20, "Geometry");
       people[4] = new Professor("J. J. Brickley", 59, 84000, 30, "Digital Systems", "Daniels Hall 322", true);
       people[5] = new Student("Courtney Brooks", 7, "2984765");
       people[6] = new K12Student("Gilbert Liriano", 10, "2568583", 4);
       people[7] = new HighSchoolStudent("Bobby Riggs", 18, "1335685", 12, 4.332);
       people[8] = new CollegeStudent("Michelle Wahome", 19, "16023", 3.688, "English", "Undergrad");
       
       for (SchoolAssociate person: people){
          System.out.println(person);
       }  
    }
 }