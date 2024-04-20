/*Shaheer Khan
 * On My Honor as a Student, I have not given nor received aid on this lab
 */
public class APExamTaker implements Gradeable
{
    private int rawScore, APScore;

    public APExamTaker()
    {
        rawScore = 0;
    }

    public void updateGrade()
    {
        rawScore++;
        if (rawScore >= 61)
            APScore = 5;
        else if (rawScore >= 46)
            APScore = 4;
        else if (rawScore >= 36)
            APScore = 3;
        else if (rawScore >= 28)
            APScore = 2;
        else
            APScore = 1;
    }

    public String getScore()
    {
        return APScore + "";
    }

    public boolean isPassing()
    {
        if (APScore >= 3)
            return true;
        else
            return false;
    }
}