package Array;
import  java.util.*;
public class MinElementArray {
    static  int MinElement(int a[])
    {int min = a[0];
        for(int i =0;i<a.length;i++)
        {
           if(a[i]<min)
           {
               min = a[i];
           }

        }
        return min;
    }
    public static void main(String args[])
    {
        int arr [] = new int [5];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
       int a =  MinElement(arr);
        System.out.println(a);

    }
}
