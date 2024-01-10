package Array.DEletion;

public class AtIndex {
    public static void Deletion(int a[],int target,int length)
    {
        for(int i =target;i<length-1;i++)
        {
a[i]=a[i+1];
        }
    }
    public static  void main(String args[])
    {
        int arr[]={22,33,44,5,223,443};
        int length = 6;
        int index = 2;
        Deletion(arr,index,length);
        length--;
        for(int i=0;i<length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println(length);
    }


}
