public class Reverse_number {
    public static void main(String args[])
    {
        int a = 300;
        int num = a;

        while(num>0)
        {  int num1 = num%10;//9
            num = num/10;
            System.out.print(num1);


        }
    }
}
