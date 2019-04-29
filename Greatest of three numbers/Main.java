import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int m= in.nextInt();
      int o =in.nextInt();
      int big;
      if((n>m)&&(n>o))
        big=n;
      else if((m>n)&&(m>o))
        big=m;
      else
        big=o;
      System.out.println(big);
    }
}