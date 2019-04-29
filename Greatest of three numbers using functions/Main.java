import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int m = in.nextInt();
      int o =in.nextInt();
      int greatest = big(n,m,o);
      System.out.println(greatest);
	}
  public static int big(int a, int b ,int c)
  {
    int large;
    if((a>b)&&(a>c))
      large=a;
    else if((a>b)&&(c>a))
      large=c;
    else
      large = b;
    return large;
  }
}