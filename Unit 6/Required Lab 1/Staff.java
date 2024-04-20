/*Shaheer Khan
 * On My Honor as a Student, I have not given nor received aid on this lab
 */
public class Staff extends SchoolAssociate
{
    private int years, salary;

    public Staff(String n, int a, int y, int s)
    {
        super(n, a);
        years = y;
        salary = s;
        super.setRole("Staff");
    }
    
    @Override
    public String toString()
    {
        return super.toString() + ", Salary: " + salary + ", Years of Experience: " + years;
    }
}