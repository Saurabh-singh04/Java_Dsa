package Array;

import java.util.Scanner;


public class LinearSearchString {
    static int SearchElement(String a[],String target)
    {
        if(a.length ==0)
        {
            return -1;
        }
        for (int i =0;i<a.length;i++)
        {
            if(a[i].equals(target))
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String arr[]= new String[5];
        System.out.println("enter the array");
        for (int i =0;i<arr.length;i++)
        {
            arr[i]= sc.nextLine();
        }
        for (int i =0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        int a = SearchElement(arr,"hi");
        System.out.println(a);
    }
}
