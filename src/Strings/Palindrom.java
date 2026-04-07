package Strings;
public class Palindrom {
    public static void main(String[] args) {
        String str = "radar";
        String rev = "";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev = rev + str.charAt(i);

        }
        if(str.toLowerCase().equals(rev.toLowerCase()))
        {
            System.out.println("palindrom");
        }
        else
        {
            System.out.println("not");
        }
    }
}
