/*Shaheer Khan
 * On My Honor as a Student, I have not given nor received aid on this lab
 */

import java.util.*;

public class HighSchoolStudent implements Gradeable
{
    private ArrayList<Integer> record;
    private double average;

    public HighSchoolStudent()
    {
        record = new ArrayList<Integer>();
    }

    @Override
    public void updateGrade()
    {
        int newScore = (int)(Math.random() * 71 + 30);
        if (newScore < 50)
            newScore = 50;
        record.add(newScore);
        int sum = 0;
        for (int i = 0; i < record.size(); i++)
            sum += record.get(i);
        average = ((double)sum / record.size());
    }

    public String getScore()
    {
        return average + "%";
    }

    public boolean isPassing()
    {
        if (average >= 63.5)
            return true;
        else
            return false;
    }
}