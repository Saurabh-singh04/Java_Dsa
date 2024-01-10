import java.util.Scanner;

public class BinarySearch {
    static int Binary(int a[],int target,int start,int end)
    {
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(a[mid]==target)
            {
                return mid;
            }
             if(a[mid]>target)
            {
                end = mid-1;
            }
            else if(a[mid]<target)
            {
                start = mid+1 ;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {

        System.out.println("enter the size of arr");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[]= new int[n];
        System.out.println("enter the element of the array ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
         int a = Binary(arr,55,0,n-1);
        System.out.println(a);

    }
}
