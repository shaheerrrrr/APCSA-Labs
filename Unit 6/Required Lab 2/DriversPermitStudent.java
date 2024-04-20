/*Shaheer Khan
 * On My Honor as a Student, I have not given nor received aid on this lab
 */
public class DriversPermitStudent implements Gradeable
{
    private int score;

    public DriversPermitStudent()
    {
        score = 100;
    }

    public void updateGrade()
    {
        score -= 4;
    }

    public String getScore()
    {
        return score + "%";
    }

    public boolean isPassing()
    {
        if (score >= 80)
            return true;
        else
            return false;
    }
}