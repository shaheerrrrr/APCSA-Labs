/*Shaheer Khan
 * On My Honor as a Student, I have not given nor received aid on this lab
 */
public class Professor extends Teacher
{
    private String office;
    private boolean tenured;

    public Professor(String n, int a, int y, int s, String sub, String o, boolean t)
    {
        super(n, a, y, s, sub);
        office = o;
        tenured = t;
        super.setRole("Professor");
    }
    @Override
    public String toString()
    {
        return super.toString() + ", Office: " + office + ", Tenured: " + tenured;
    }
}
