package Sorting;

public class BubbleSort {
    static int[] BubbleSort(int a[])
    {
        for(int i =0;i<a.length-1;i++)
        {
           for(int j=0;j<a.length-1-i;j++)
           {
               if(a[j]>a[j+1])
               {
                   //swap
                   int temp = a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
               }

           }

        }
        return  a;
    }
    public static void main(String args[])
    {
        int arr[] = { 3,4,5,2,1};
        int a[]=   BubbleSort(arr);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }


    }

}
