package Array;

import java.util.Scanner;

public class ArrayCreation {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr []= new int [5];

        System.out.println("enter the element");
        for(int i =0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i =0;i<5;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
