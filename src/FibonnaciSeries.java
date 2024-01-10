//0 1 1 2 3 . ... { 0+1 =1
//1+2 =3
//}
public class FibonnaciSeries {
    public static void main(String[] args) {
        int n1,n2,n3 , series ;
        n1 =0;
        n2=1;
        System.out.print(n1 +" "+n2);
        series = 10;
        for(int i=2;i<=series;i++)
        {
            n3 = n1+n2;//0+1 =1
            System.out.print(" "+n3);//1
            n1=n2;//1
            n2=n3;//1
        }
    }
}