public class SubArray {
//    subarry -:
//    [2],[2,4],[2,4,6],[2,4,6,8][2,4,6,8,10]
//    [4][4,6][4,6,8]
    static  void printSubArry(int a[])
    {
        for(int i =0;i<a.length;i++)
        {
            for(int j = i;j<a.length;j++)
            {
                for(int k = i;k<=j;k++)
                {
                    System.out.print(a[k]);

                }    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int arr[]={2,4,6,8,10};
        printSubArry(arr);
    }
}
