package Array;

public class Prefix_sum{
    //    subarry -:
//    [2],[2,4],[2,4,6],[2,4,6,8][2,4,6,8,10]
//    [4][4,6][4,6,8]
    static  void MaxSubArry(int a[])
    {
        int prefix[] = new int[a.length];
        prefix[0]=a[0];
        for(int i=1;i<a.length;i++)
        {
            prefix[i]=prefix[i-1]+a[i];


        }



        int max = Integer.MIN_VALUE;

        for(int i =0;i<a.length;i++)
        {
            int currSum =0;

            for(int j=i;j<a.length;j++)
            {
                int end = j;
                int start = i;
                currSum = start == 0 ? prefix[end]:  prefix[end]-prefix[start-1];
                if(currSum>max)
                {
                    max = currSum;
                }
            }


        }
        System.out.println(max);
    }



    public static void main(String[] args)
    {
        int arr[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        MaxSubArry(arr);
    }
}
