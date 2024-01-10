import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        int age ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age ");
        age = sc.nextInt();
        if(age>=18)
        {
            System.out.println("you are eligible for vote");
        }
        else
        {
            System.out.println("you are not eligible");
        }
    }
}
