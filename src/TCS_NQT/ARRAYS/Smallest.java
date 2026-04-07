package TCS_NQT.ARRAYS;
class  Smallest {
static int smallest(int a[])
{
    int min=Integer.MAX_VALUE;
    for(int i=0;i<a.length;i++)
    {
        if(a[i]<min)
        {
            min = a[i];
        }
    }
    return min;
}
    static int largest(int a[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }
        return max;
    }


    public static void main(String args[]) {
    int arr[]={2,3,4,5,6};
  int a=  smallest(arr);
        System.out.println(a);
    }
}