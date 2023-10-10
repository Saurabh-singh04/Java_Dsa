import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age");
        int age = sc.nextInt();
        if(age>=18)
        {
            System.out.println("you will give vote");
        }
        else
        {
            System.out.println("not eligibles");
        }
    }
}
