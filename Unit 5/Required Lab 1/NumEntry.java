/*Shaheer Khan
 * On My Honor as a Student, I have not given nor received aid on this lab
 */
public class NumEntry
{
    private int value, frequency;

    public NumEntry(int val)
    {
        value = val;
        frequency = 1;
    }

    public void recordCopy()
    {
        frequency++;
    }

    public int getValue()
    {
        return value;
    }

    public int getFreq()
    {
        return frequency;
    }

    public String toString()
    {
        return "{Value: " + value + ", Freq: " + frequency + "}";
    }
}
