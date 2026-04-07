package TCS_NQT.ARRAYS;

public class SecondLargest {
    static void secondLargest(int a[])
    {
        int fl =0;
        int sl =0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>fl)
            {
                sl = fl;
                fl = a[i];
            }
            else if(a[i]<fl && a[i]>sl)
            {
                sl = a[i];
            }
        }
        System.out.println(fl+"  "+sl);
    }
    public static void main(String args[])
    {
        int arr[]={8,3,5,2,6,33,22,77,77};
        secondLargest(arr);
    }
}
