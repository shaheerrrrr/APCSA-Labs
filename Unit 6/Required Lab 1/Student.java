/*Shaheer Khan
 * On My Honor as a Student, I have not given nor received aid on this lab
 */
public class Student extends SchoolAssociate
{
    private String id;

    public Student(String n, int a, String i)
    {
        super(n, a);
        id = i;
        super.setRole("Student");
    }
    @Override
    public String toString()
    {
        return super.toString() + ", ID Number: " + id;
    }
}
