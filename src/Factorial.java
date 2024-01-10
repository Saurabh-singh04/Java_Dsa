public class Factorial {

    public static void main(String[] args) {
        int n =5;
        int f = 1;
        for(int i=n;i>1;i--)
        {
            f = i*f;//5//20//3//2/
        }
        System.out.println(f);
    }
}
