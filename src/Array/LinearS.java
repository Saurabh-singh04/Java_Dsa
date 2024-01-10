package Array;

import java.util.Scanner;


public class LinearS {
    static int SearchElement(int a[],int target)
    {
if(a.length ==0)
{
    return -1;
}
for (int i =0;i<a.length;i++)
{
    if(a[i]==target)
    {
        return i;
    }
}
return -1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[5];
        System.out.println("enter the array");
        for (int i =0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
       int a = SearchElement(arr,44);
        System.out.println(a);
    }
}
