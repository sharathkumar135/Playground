import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in =new Scanner(System.in);
    int n=in.nextInt();
    int m=n/100;
    int o = n%10;
    int p = (n/10)%10;
    int x=o*100;
    int y=p*10;
    int result=x+y+m;
    System.out.println(result);
  }
}