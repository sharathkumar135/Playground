import java.util.Scanner;
import java.lang.Math;
 class Main
{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int n =in.nextInt();
    int m = in.nextInt();
    double p = power(n,m);
    System.out.println(p);
  }
  public static double power(int x,int y)
  {
    double s=Math.pow(x,y);
    return s;
  }
}