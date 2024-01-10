//Prime number is a number that is greater than 1 and divided by 1 or itself only
//        In other words, prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check prime or not");
        int num = sc.nextInt();
        if(num==2)
        {
            System.out.println("prime number");
        }
        else
        {
            boolean isprime = true;
            for(int i=2;i<=num-1;i++)
            {
                if(num%i==0)
                {
                    isprime = false;
                }
            }
            if(isprime ==true)
            {
                System.out.println("prime number");
            }
            else
            {
                System.out.println("not prime");
            }
        }
    }
}