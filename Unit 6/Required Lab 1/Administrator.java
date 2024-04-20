/*Shaheer Khan
 * On My Honor as a Student, I have not given nor received aid on this lab
 */
public class Administrator extends Staff
{
    private String department1, department2;

    public Administrator(String n, int a, int y, int s, String d1, String d2)
    {
        super(n, a, y, s);
        department1 = d1;
        department2 = d2;
        super.setRole("Administrator");
    }
    @Override
    public String toString()
    {
        return super.toString() + ", Oversees " + department1 + " and " + department2 + " departments";
    }
}
