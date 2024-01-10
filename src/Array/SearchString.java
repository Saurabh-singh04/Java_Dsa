package Array;

public class SearchString {
    static  int search(String n ,char t)
    {
        if(n.length()==0)
        {
            return -1;
        }
        for(int i=0;i<n.length();i++)
        {
            if(t == n.charAt(i))
            {
                return 1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        String  name = "saurabh";
        char target = 'i';
       int a = search(name,target);
        System.out.println(a);

    }
}
