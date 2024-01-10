package Array.Insertion;
import java.util.Scanner;


public class InsertAnyWhere {
    public static void Insert(int a[],int target)
    {
        for(int i=a.length-2;i>=target;i--)
        {
a[i+1]=a[i];




        }
    }
    public static void main(String args[])
    {
        int index = 4;
        int arr[]= new int[7];
        Scanner sc = new Scanner(System.in);
       arr[0]=1;
        arr[1]=2;

        arr[2]=3;
        arr[3]=4;

        arr[4]=5;

        arr[5]=6;



        Insert(arr,index);
        arr[index]=55;
        for(int i =0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
