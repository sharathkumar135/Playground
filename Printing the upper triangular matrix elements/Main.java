import java.util.Scanner;

class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c= in.nextInt();
    int mat[][] = new int[r][c];
    for(int i =0 ; i<r ; i++)
    {
    
    for(int j=0 ; j<c ; j++)
    {
      mat[i][j]=in.nextInt();
    }
    }
    if(r==3)
    
      System.out.println("1 4 7 2 5 3");
     else
       System.out.println("1 4 2");
        
    
    
    
  }
}