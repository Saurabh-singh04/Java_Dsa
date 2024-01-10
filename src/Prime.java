import java.util.*;
public class Prime {
    public static  void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime = isPrime(n);
        System.out.println(prime);

    }
    static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return  false;
        }
        int c = 2;
        while (c*c <=num)
        {
            if(num%c==0)
            {
                return false;
            }
            c++;
        }
        return  c*c>num;
    }
}
