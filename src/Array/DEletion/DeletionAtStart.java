package Array.DEletion;

public class DeletionAtStart {
    public static void main(String args[])
    {
        int arr[]={1,2,3,44,5,66};
        int length = 0;
        for(int i =0;i<arr.length-1;i++)
        {
            arr[i]= arr[i+1];
            length++;
            System.out.println(arr[i]);

        }
        System.out.println(length);

    }
}
