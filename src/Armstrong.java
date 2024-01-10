import java.util.Scanner;
import java.lang.Math;

public class Armstrong {

    public static  void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();

        Armstrongs(n);



    }
    static  void Armstrongs(int num)
    { int original  = num;

        int sum =0;
        while (num>0)
        {
            int rem = num%10;
            num = num/10;
            sum = sum + rem*rem*rem;
        }
        if(original == sum)
        {
            System.out.println(sum +"\tarmstrong number");
        }
        else
        {
            System.out.println("not armstrong");
        }


    }
}
