package Array;

public class Max_subArray {
    //    subarry -:
//    [2],[2,4],[2,4,6],[2,4,6,8][2,4,6,8,10]
//    [4][4,6][4,6,8]
    static  void printSubArry(int a[])
    {
        int curr = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            { curr =0;
                for(int k =i;k<=j;k++)
                {
curr = curr+a[k];
                }
                if(max<curr)
                {
                    max = curr;
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args)
    {
        int arr[]={2,4,6,8,10};
        printSubArry(arr);
    }
}
