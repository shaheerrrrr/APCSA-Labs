/*Shaheer Khan
 * On My Honor as a Student, I have not given nor received aid on this lab
 */

public class Student implements Comparable
{
    private String name;
    private double gpa;

    public Student(String n, double g)
    {
        name = n;
        gpa = g;
    }

    public String getName()
    {
        return name;
    }

    public double getGpa()
    {
        return gpa;
    }

    public int compareTo(Student o)
    {
        double other = o.getGpa();
        if(gpa > other)
            return 1;
        else if(gpa == other)
            return 0;
        else
            return -1;
    }

    @Override
    public String toString()
    {
        return name + " has GPA " + gpa;
    }

}