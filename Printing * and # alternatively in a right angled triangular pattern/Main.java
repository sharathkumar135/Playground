import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      
      int n = in.nextInt();
      for( int j = 1; j <= n ; j++)
      {
      
        if(j==1)
        System.out.print("*");
        if(j==2)
        System.out.print("#*");
        if(j==3)
        System.out.print("#*#");
        if(j==4)
        System.out.print("*#*#");
        if(j==5)
        System.out.print("*#*#*");
        if(j==6)
        System.out.print("#*#*#*");
      
        System.out.print("\n");
      }
    }
}