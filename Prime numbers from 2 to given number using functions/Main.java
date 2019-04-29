import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      if(n>1)
       pri(n);
      else
        System.out.println(n);
      
	}
  public static void pri(int a){
  for(int i=2 ;i<=a; i++)
  {
    int count=0;
    for(int j=i;j>=2;j--)
    {
      
    if(i%j==0)
      count=count+1;
    }
    if(count==1){
      System.out.println(i);
    }
  }
  }
}