package Array;

public class LinearSearch {
    static int search(int a[],int key)
    {
        for(int i =0;i<a.length;i++)
        {
            if(a[i]==key)
            {
              return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,3,54,35,33};

       int  j = search(arr,54);
        System.out.println(j);


    }
}
