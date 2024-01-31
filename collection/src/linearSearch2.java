import java.util.*;
public class linearSearch2 {
    public static int search(int arr[])
    {
        if (arr.length==0)
        {
            return -1;
        }
        int element=arr[0];
        for (int i=1;i<arr.length;i++)
        {

            if (arr[i]>element)
            {
                element=arr[i];
            }
        }
        return element;

        /*int n = arr.length;
        collections.sort(arr);*/
    }

    public static void main(String[] args) {
        int arr[]={18,12,-7,3,14,28};

        System.out.println(search(arr));
    }

}
