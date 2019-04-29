
import java.util.Scanner;
  class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
  String str= in.nextLine();
    double d =0.0;
    for(int i=0 ; i<str.length(); i++)
    {
      double n=str.charAt(i)-48.0;
      d=d*10+n;
    }
    d=Double.parseDouble(str);
    //System.out.printf("%.6f",d);
    System.out.printf("%.6f",d);
  }
}