import java.util.Scanner;
public class Sum_natural {

    public static void main(String args[])
    {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for sum");
        a = sc.nextInt();
        int sum =0;
        for(int i =0;i<=a;i++)
        {
            sum =sum +i;
        }
        System.out.println("sum of the natural number\t"+a+"is\t"+sum);

    }
}
