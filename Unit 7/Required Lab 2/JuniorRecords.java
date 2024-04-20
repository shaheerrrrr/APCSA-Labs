/*Shaheer Khan
 * On My Honor as a Student, I have not given nor received aid on this lab
 */

import java.util.*;

public class JuniorRecords
{
    private ArrayList<Student> students;
    private ArrayList<Student> marshals;
    private int lowIndex;

    public JuniorRecords() {
        students = new ArrayList<Student>();
        marshals = new ArrayList<Student>();
    }
    
    private void sort(ArrayList<Student> s) {
        for(int i = 1; i < s.size(); i++)
        {
            int u = i;
            while(u > 0 && s.get(u).compareTo(s.get(u - 1)) > 0)
            {
                s.set(u, s.set(u - 1, s.get(u)));
                u--;
            }
        }
    }

    public void addStudent(Student wynson) {
        students.add(wynson);
        if(wynson.getGpa() >= 3.75) {
            marshals.add(wynson);
            sort(marshals);
            for(int i = 0; i < marshals.size() - 1; i++)
            {
                if(marshals.get(i).compareTo(marshals.get(i + 1)) == 0)
                {
                    lowIndex = i;
                    break;
                }
            }
            if(marshals.size() > 9)
            {
                for(int i = marshals.size() - 1; i > 9; i--)
                {
                    if(marshals.get(i).getGpa() < marshals.get(9).getGpa())
                        marshals.remove(i);
                }
            }
        }
    }
    
    public void printAll()
    {
        System.out.println("All Students");
        for(Student kids : students) {
            System.out.println(kids);
        }
    }

    public void printJuniorMarshals() {
        System.out.println("Junior Marshals");
        int num;
        for(int i = 0; i < marshals.size(); i++)
        {
            if (marshals.size() > 10 && i > lowIndex)
                num = lowIndex;
            else
                num = i;
            System.out.println("#" + (num + 1) + ": " + marshals.get(i));
        }
    }
}