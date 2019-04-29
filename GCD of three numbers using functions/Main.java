import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in =new Scanner(System.in);
      int n = in.nextInt();
      int m =in.nextInt();
      int o =in.nextInt();
      int gcd = GCD(n,m,o);
      System.out.println(gcd);
	}
  public static int GCD(int a,int b,int c)
  {
    int g=0;
    int min= a<b?a:b;
    int l = min<c?min:c;
    for(int i =l ;i>0 ;i--)
    {
        if((a%i==0)&&(b%i==0)&&(c%i==0))
        {
          g=i;
          break;
        }
      }
    return g;
    }
  }

