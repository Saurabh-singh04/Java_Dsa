package Array;

public class Reverse_array {
    static void reverse(int a[])
    {
        int s =0;
        int l = a.length-1;
        while(s<l)
        {
            int temp = a[l];
            a[l]=a[s];
            a[s]=temp;
            s++;
            l--;
        }
        for(int i =0;
        i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }

    public static void main(String[] args) {
        int arr[]={53,333,43,43,32,43,2};
        reverse(arr);


    }
}
