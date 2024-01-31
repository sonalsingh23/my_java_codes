public class search2dArray {
    public static void main(String[] args) {
        int [][] arr={
                {23,4,10},
                {11,12,78,54},
                {18,13,3,9},

        };
        int target=18;
        int[] ans=linearSearch(arr,target);
        System.out.println(arr.toString(ans));
    }
    static int[] linearSearch(int [][] arr,int target)
    {
        /*if (arr.length==0)
        {
            return 0;
        }*/
        for (int row=0;row<arr.length;row++)
        {
            for (int col=0;col<arr.length;col++)
            {
               if (arr[row][col]==target)
               {
                   System.out.println(row+" "+col);
                   return new int[][];
               }

            }
        }
        return -1;
    }
}
