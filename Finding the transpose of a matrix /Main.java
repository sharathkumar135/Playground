import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int mat[][] = new int[r][c];
    int tran[][] = new int[c][r];
    for(int i=0 ; i<r ; i++)
    {
      for(int j=0 ; j<c ; j++)
        mat[i][j]=in.nextInt();
    }
    for(int i=0 ; i<r ; i++)
    {
      for(int j=0 ; j<c ; j++)
        tran[j][i]=mat[i][j];
    }
    for(int i=0 ; i<c ; i++)
    {
      for(int j=0 ; j<r; j++)
        System.out.print(tran[i][j]+" ");
      System.out.println();
    }
  }
}