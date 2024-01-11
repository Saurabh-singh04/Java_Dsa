package Sorting;

public class CyclicSort {

    static int[] CyclicS(int a[])
    {
        int i =0;
        while (i<a.length)
        {
            int correctIndex = a[i]-1;
            if(a[i]!=a[correctIndex])
            {
                int temp = a[i];
                a[i]=a[correctIndex];
                a[correctIndex]=temp;
            }
            else
            {
                i++;
            }
        }
        return a;
    }

    public static void main(String args[])
    {
        int arr[] = { 3,4,5,2,1};
        int a[]=    CyclicS(arr);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }


    }
}
