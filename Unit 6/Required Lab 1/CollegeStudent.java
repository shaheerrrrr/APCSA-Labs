/*Shaheer Khan
 * On My Honor as a Student, I have not given nor received aid on this lab
 */
public class CollegeStudent extends Student
{
    private double gpa;
    private String major, status;

    public CollegeStudent(String n, int a, String i, double g, String m, String stat)
    {
        super(n, a, i);
        gpa = g;
        major = m;
        status = stat;
        super.setRole("College Student");
    }
    @Override
    public String toString()
    {
        return super.toString() + ", GPA: " + gpa + ", Major: " + major + ", Status: " + status;
    }
}
