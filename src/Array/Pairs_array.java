package Array;

import java.util.Scanner;


public class Pairs_array {
  public  static void pairs(int a[])
  {
for (int i=0;i<a.length-1;i++)
{
  for(int j=i+1;j<a.length;j++)
  {
    System.out.print("("+a[i]+","+a[j]+")");//(2,4) (2,6) (2,8) (2,10)
  }
  System.out.println();
}
  }

  public static void main(String[] args) {
    int arr[] = {2,4,6,8,10};
    pairs(arr);
  }



}
