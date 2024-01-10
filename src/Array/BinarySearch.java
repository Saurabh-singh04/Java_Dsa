package Array;

public class BinarySearch {

        static int search(int a[],int key)
        {
            int f = 0;
            int l = a.length-1;
            while(f<=l)
            {
                int mid = (f+l)/2;
                if(a[mid]==key)
                {
                    return mid;
                }
                if(a[mid]>key)
                {
                    l = mid-1;
                }
                else
                {
                    f = mid+1;
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

