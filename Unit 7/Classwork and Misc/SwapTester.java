import java.util.*;
public class SwapTester
{
    public static void swap(ArrayList<Double> list, int a, int b)
    {
        double temp = list.set(a, list.get(b));
        list.set(b, temp);
    }

    public static void main(String[] args)
    {
        ArrayList<Double> testList = new ArrayList<Double>();
        testList.add(9.11);
        testList.add(123.4);
        System.out.println(testList);
    }
}
