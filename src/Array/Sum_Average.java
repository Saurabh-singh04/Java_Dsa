package Array;

import java.util.Scanner;

public class Sum_Average {
    public static void   Sum_average(int arr[])
    {
        int sum = 0;
        for(int i =0;i<arr.length;i++)
        {
            sum = arr[i]+sum;


        }System.out.println(sum);
        float avg = sum/arr.length;
        System.out.println(avg);

    }
    public static  void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    int arr[]= new int[5];
    System.out.println("enter the element of array");
    for(int i =0;i<arr.length;i++)
    {
        arr[i]= sc.nextInt();
    }

    Sum_average(arr);

}
}
