import java.util.*;
public class linear {
    public static int linearSearch(int arr[],int key)
    {
        for (int i=0;i<arr.length;i++)
        {
            //int temp=arr[0];
            if (arr[i]==key)
            {
                return i;
            }

            }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
       int result= linearSearch(arr,key);
       if (result!=-1)
       {
           System.out.println("key found "+result);
       }
       else
           System.out.println("key not found");
    }
}
