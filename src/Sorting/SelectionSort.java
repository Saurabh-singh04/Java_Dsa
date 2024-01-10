package Sorting;

public class SelectionSort {
    static int[] SelectionSort(int a[])
    {
        for(int i =0;i<a.length-1;i++)
        {
            int minPos = i;
            for(int j =i+1;j<a.length;j++)
            {
                if(a[minPos]>a[j])
                {
                    minPos = j;
                }
            }
            int temp = a[minPos];
            a[minPos ]= a[i];
            a[i]=temp;
        }
        return  a;
    }
    public static void main(String args[])
    {
        int arr[] = { 3,4,5,2,1};
     int a[]=   SelectionSort(arr);
     for(int i=0;i<a.length;i++)
     {
         System.out.print(a[i]+" ");
     }


    }

}
