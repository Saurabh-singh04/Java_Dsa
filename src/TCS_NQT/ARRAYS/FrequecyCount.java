package TCS_NQT.ARRAYS;

public class FrequecyCount {
    static int frequency(int a[],int key)
    {
        int hash[]=new int[10];
        for(int i=0;i<a.length;i++)
        {
            hash[a[i]]+=1;
        }
        return hash[key];
    }
    public static void main(String[] args) {
        int a[]={2,1,3,4,3,5,2,1,5};
        int target =2;
       int b= frequency(a,target);
        System.out.println(b);
    }
}
