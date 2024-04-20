/*Shaheer Khan
 * On My Honor as a Student, I have not given nor received aid on this lab
 */
public class HighSchoolStudent extends K12Student
{
    private double gpa;

    public HighSchoolStudent(String n, int a, String i, int r, double g)
    {
        super(n, a, i, r);
        gpa = g;
        super.setRole("High School Student");
    }
    @Override
    public String toString()
    {
        return super.toString() + ", GPA: " + gpa;
    }
}