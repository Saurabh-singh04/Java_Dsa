public class Max_subArray {
    //    subarry -:
//    [2],[2,4],[2,4,6],[2,4,6,8][2,4,6,8,10]
//    [4][4,6][4,6,8]
    static  void printSubArry(int a[])
    {
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i =0;i<a.length;i++)
        {

            for(int j = i;j<a.length;j++)
            {    currSum = 0;
                for(int k = i;k<=j;k++)
                {
//                    System.out.print(a[k]);

                    currSum += a[k];
                    if(currSum>max)
                    {
                        max = currSum;
                    }

                }
            }

        }
        System.out.print("max "+max);
    }
    public static void main(String[] args)
    {
        int arr[]={2,4,6,8,10};
        printSubArry(arr);
    }
}
