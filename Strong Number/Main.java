import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int a = (n/100);
      int b = (n/10)%10;
      int c = n%10;
      int d ;
      int sum1=1,sum2=1,sum3=1;
        for( int i = 1;i<=a;i++)
        {
          sum1=sum1*i;
        }
      for( int j= 1;j<=b;j++)
        {
          sum2=sum2*j;
        }
      for( int k = 1;k<=c;k++)
        {
          sum3=sum3*k;
        }
      d=sum1+sum2+sum3;
      if(d == n)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}