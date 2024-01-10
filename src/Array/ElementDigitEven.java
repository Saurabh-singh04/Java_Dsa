package Array;
import  java.util.*;
public class ElementDigitEven{
    static  int ElementDigit(int a[])
    {

        int even = 0;
        for(int i =0;i<a.length;i++)
        {   int count = 0;
            while (a[i]>0) {
                count ++;

                a[i]= a[i]/10;

            }
            if(count%2==0)
            {
                even++;
            }

        }
        return even;
    }

    public static void main(String args[])
    {
        int arr [] = new int [5];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        int a = ElementDigit(arr);
        System.out.println(a);

    }
}
