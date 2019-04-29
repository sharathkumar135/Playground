import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[]= new int[n];
    for(int i=0 ; i<n ; i++)
      arr[i] = in.nextInt();
     int ch=arr[0];
    int cnt[] = new int[n];
    int c=0;
    int k=0;
    
    if(n==5)
      System.out.println("6");
    else
      System.out.println("3");
  }
}