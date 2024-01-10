package Array.Insertion;

public class AtStart {
    public static void main(String args[])
    {
        int [] arr = new int[5];
        arr[0]= 11;
        arr[1]= 211;      arr[2]= 113;      arr[3]= 3311;
        for(int i =arr.length-2;i>=0;i--)
        {

          arr[i+1]=arr[i];

//            System.out.println(arr);
        }
        arr[0]=44;
for (int i =0;i<arr.length;i++)
{
    System.out.println(arr[i]);
}
    }
}
