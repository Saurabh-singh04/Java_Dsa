package TCS_NQT.String;

public class LastWordFrequency {


    public static void main(String[] args) {
        String s = "fly in the moon  ";
        s = s.trim();
        int c =0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            {
                c++;
            }
            else
            {
                break;
            }
        }

        System.out.print(c);
    }

}
