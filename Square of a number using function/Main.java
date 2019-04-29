import java.util.Scanner;
class Main
{
  public static int sqr(int x)
  {
    return(x*x);
  }
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner in = new Scanner(System.in);
      int n =in.nextInt();
      int square = sqr(n);
      System.out.println(square);
	} 
}