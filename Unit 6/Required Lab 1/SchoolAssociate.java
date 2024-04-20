/*Shaheer Khan
 * On My Honor as a Student, I have not given nor received aid on this lab
 */
public class SchoolAssociate
{
    private int age;
    private String name;
    private String role;

    public SchoolAssociate(String n, int a)
    {
        name = n;
        age = a;
        setRole("School Associate");
    }

    public void setRole(String rol)
    {
        role = rol;
    }
    
    @Override
    public String toString()
    {
        return "Name: " + name + ", Age: " + age + ", Role: " + role;
    }
}
