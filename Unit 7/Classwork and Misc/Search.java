import java.util.*;
public class Search
{
    public static int targetSearch(String[] list, String target)
    {
        int index = -1;
        for (int i = 0; i < list.length; i++)
        {
            if (list[i].equals(target))
            {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int lengthSearch(ArrayList<String> list, int length)
    {
        int index = -1;
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).length() == length)
            {
                index = i;
                break;
            }
        }
        return index;
    }

    public int binSearch (Comparable[] arr, Comparable target)
    {
        int left = 0;
        int right = arr.size() - 1;
        while (left <= right)
        {
            int mid = (left + right) / 2;
            if (arr[mid].equals(target)) // if target matches mid
                return mid;
            
            else if (arr[mid].compareTo(target) < 0) //if target exists, it's to the right of mid
                left = mid + 1;

            else //if target exists, it's to the left of mid
                right = mid - 1;
        }
        return -1;
    }
    
    public int binSearch (ArrayList<Comparable> arr, Comparable target)
    {
        int left = 0;
        int right = arr.size() - 1;
        while (left <= right)
        {
            int mid = (left + right) / 2;
            if (arr.get(mid).equals(target)) // if target matches mid
                return mid;
            
            else if (arr.get(mid).compareTo(target) < 0) //if target exists, it's to the right of mid
                left = mid + 1;

            else //if target exists, it's to the left of mid
                right = mid - 1;
        }
        return -1;
    }
}
