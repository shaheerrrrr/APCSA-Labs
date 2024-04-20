import java.util.*;
public class SortTester
{
    public static void swap(ArrayList<Integer> list, int a, int b)
    {
        int temp = list.set(a, list.get(b));
        list.set(b, temp);
    }

    public static int selSort(ArrayList<Integer> list)
    {
        int count = 0;
        for (int i = 0; i < list.size(); i++)
        {
            int max = i;
            for (int u = 0; u < list.size(); u++)
            {
                if (list.get(u) < list.get(max))
                {
                    max = u;
                    if (i != max)
                    {
                    swap(list, i, max);
                    count++;
                    }
                }
            }
            
        }

        return count;
    }

    public static int insertSort(ArrayList<Integer> list)
    {
        int count = 0;
        for (int i = 0; i < list.size(); i++)
        {
            int u = i;
            while (u > 0 && list.get(u) > list.get(u-1))
            {
                swap(list, u-1, u);
                u--;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++)
        {
            int temp = (int)(Math.random() * 36) + 15;
            list1.add(temp);
            list2.add(temp);
        }
        System.out.println(list1);
        System.out.println(list2);
        selSort(list1);
        insertSort(list2);
        System.out.println(list1);
        System.out.println(list2);
    }
}
