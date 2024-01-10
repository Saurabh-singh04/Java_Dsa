package Array;

public class LargestArray {



        static int search(int a[])
        {   int max =Integer.MIN_VALUE;
            for(int i =0;i<a.length;i++)
            {

            if(a[i]>max)
            {
                max = a[i];

            }}
            return max;
        }
        public static void main(String[] args) {
            int arr[]={4,3,54,35,33};

            int  j = search(arr);
            System.out.println(j);


        }
    }


