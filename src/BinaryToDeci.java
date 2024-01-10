import java.lang.Math;
public class BinaryToDeci {
    static void binaryToDeci(int num)//001
    {
        int deci =0;
        int rem =0;
        int pow =0;


        while(num>0)
        {
            rem = num%10;//1
            deci = deci +(rem*( int)Math.pow(2,pow));
            rem++;
num=num/10;

        }
        System.out.println(deci);
    }
    public static void main(String[] args) {
binaryToDeci(111);
    }
}
