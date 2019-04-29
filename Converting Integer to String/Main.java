import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner in = new Scanner(System.in);
    int n= in.nextInt();
    int temp=n;
    int count=0;
    while(n>0)
    {
      count++;
      n=n/10;
    }
    
    
    
   // System.out.println(count);
    String str="";
    StringBuilder sb=new StringBuilder(str);
    int c=count;
    
    String s =String.valueOf(temp);
    System.out.println(s);
  }
}