import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner  in = new Scanner(System.in);
    int r= in.nextInt();
    int c= in.nextInt();
    int mat[][] = new int[r][c];
    int mat2[][] = new int[r][c];
    for(int i=0 ; i<r ; i++)
    {
      for(int j=0 ; j<c ; j++)
        mat[i][j]=in.nextInt();
    }
    for(int i=0 ; i<r ; i++)
    {
      for(int j=0 ; j<c ; j++)
        mat2[i][j]=in.nextInt();
    }
    for(int i=0 ; i<r ; i++)
    {
      for(int j=0 ; j<c ; j++)
        System.out.print(mat[i][j]-mat2[i][j]+" ");
      System.out.println();
    }
  }
}