//number whose square's the last digit is also same as that number
// ex 5 square is 25 so 5 is last digit
//25 square is 625 so 25 is last digit


import java.util.Scanner;
import java.lang.Math;

public class AutomorphicNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int num1 = num;
        int digit = 0;
        while (num1 > 0) {
            num1 = num1 / 10;
            digit++;
        }
        System.out.println(digit);
        int s = num * num;
        System.out.println(s);
        double b = Math.pow(10, digit);
        int p = (int) b;
        System.out.println(p);
        int t = s%p;
        System.out.println(t);
        if (num == t) {
            System.out.println("Automorphic number");
        } else
        {
            System.out.println("not");
        }





    }
}
