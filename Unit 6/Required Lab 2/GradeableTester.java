/*Shaheer Khan
 * On My Honor as a Student, I have not given nor received aid on this lab
 */
public class GradeableTester
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 20; i++)
        {
            if (Math.random() < .33)
            {
                Gradeable brian = new HighSchoolStudent();
                int limit = (int)(Math.random()* 20 + 1);
                for (int u = 0; u < limit; u++)
                {
                    brian.updateGrade();
                }
                if (brian.isPassing())
                    System.out.println("Brian is a high school student, finished math this quarter with a " + brian.getScore() + " and passed.\n");
                else
                    System.out.println("Brian is a high school student, finished math this quarter with a " + brian.getScore() + " and did not pass.\n");
            }

            else if (Math.random() < .66)
            {
                Gradeable grace = new APExamTaker();
                int limit = (int)(Math.random()* 66 + 15);
                for (int u = 0; u < limit; u++)
                {
                    grace.updateGrade();
                }
                if (grace.isPassing())
                    System.out.println("Grace took an AP Exam, scored " + grace.getScore() + " out of 5, and passed.\n");
                else   
                    System.out.println("Grace took an AP Exam, scored " + grace.getScore() + " out of 5, and did not pass.\n");
            }

            else
            {
                Gradeable wynson = new DriversPermitStudent();
                int limit = (int)(Math.random()* 13);
                for (int u = 0; u < limit; u++)
                {
                    wynson.updateGrade();
                }
                if (wynson.isPassing())
                    System.out.println("Wynson tested for his drivers permit, earned a score of " + wynson.getScore() + " and passed.\n");
                else
                    System.out.println("Wynson tested for his drivers permit, earned a score of " + wynson.getScore() + " and did not pass.\n");
            }
        }
    }
}
