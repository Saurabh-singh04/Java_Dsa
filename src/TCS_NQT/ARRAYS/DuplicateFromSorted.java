package TCS_NQT.ARRAYS;

public class DuplicateFromSorted {
    static int duplicate(int a[])
    {
        int m=0;

        int n= a.length;
        for(int i=1;i<n;i++)
        {
            if(a[m]!=a[i])
            {
                m++;
                a[m]=a[i];
            }

        }

        // Set the remaining positions to 0
        for (int i = m + 1; i < n; i++) {
            a[i] = 0;
        }
        return m+1;
    }
    public static void main(String[] args) {
        int a[]={1,1,2,2,2,3,3};
       int m= duplicate(a);
       for (int i=0;i<a.length;i++)
       {
           System.out.println(a[i]);
       }
    }
}
