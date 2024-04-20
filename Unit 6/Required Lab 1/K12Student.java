/*Shaheer Khan
 * On My Honor as a Student, I have not given nor received aid on this lab
 */
public class K12Student extends Student
{
    private int grade;

    public K12Student(String n, int a, String i, int r)
    {
        super(n, a, i);
        grade = r;
        super.setRole("K12Student");
    }
    @Override
    public String toString()
    {
        return super.toString() + ", Grade Level: " + grade;
    }
}
