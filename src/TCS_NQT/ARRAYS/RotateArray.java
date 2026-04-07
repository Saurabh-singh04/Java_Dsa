package TCS_NQT.ARRAYS;

public class RotateArray {
    static int[] rotate(int a[],int k)
    {
        int n = a.length;
        int temp[]= new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            temp[(i+k)%n]= a[i];
        }
        return temp;

    }
    public static void main(String[] args) {
        int arr[]={2,3,11,44,5,6};
        int k =2;
      int a[]=  rotate(arr,k);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
