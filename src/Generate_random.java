import java.util.Random;

public  class Generate_random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(50);
        System.out.println(num);
        float f = r.nextFloat(22);
        System.out.println(f);
        boolean b = r.nextBoolean();
        System.out.println(b);
    }
}