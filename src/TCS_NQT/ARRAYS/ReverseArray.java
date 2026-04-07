package TCS_NQT.ARRAYS;

public class ReverseArray {
    static int [] reverse(int a[])
    {
        int s=0;
        int e = a.length-1;

        for(int i=0;i<a.length/2;i++)
        {
            int temp = a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }
        return  a;

    }
    public static void main(String[] args) {
        int arr[]={3,4,2,6,77};
       int a[]= reverse(arr);
      for(int i=0;i<a.length;i++){
          System.out.println(a[i]);
      }
    }
}
