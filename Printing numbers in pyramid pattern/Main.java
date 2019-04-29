import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in= new Scanner(System.in);
      int n =in.nextInt();
       int num=1;
      for(int k=1;k<=n;k++)
      {
        for(int s= 1;s<=n-k;s++)
        {
          System.out.print(" ");
        }
       
        for(int j=1;j<=k;j++)
        {
          System.out.print(num+" ");
          num++;
        }
        System.out.println("");
      }
        
    }    
}