/*Shaheer Khan
 * On My Honor as a Student, I have not given nor received aid on this lab
 */
public class Teacher extends Staff
{
    private String subject;

    public Teacher(String n, int a, int y, int s, String sub)
    {
        super(n, a, y, s);
        subject = sub;
        super.setRole("Teacher");
    }
    @Override
    public String toString()
    {
        return super.toString() + ", Teaches: " + subject;
    }
}
