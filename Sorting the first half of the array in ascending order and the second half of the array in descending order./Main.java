import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i=0 ; i<n ; i++)
      arr[i]= in.nextInt();
    int mid=n/2;
    for(int j=0;j<mid-1;j++)
    {
      for(int k=0 ;k<mid-1 ; k++)
      {
        if(arr[k]>arr[k+1])
        {
          int t = arr[k];
          arr[k]=arr[k+1];
          arr[k+1]=t;
        }
      }
    }
    for(int j=mid;j<n-1;j++)
    {
      for(int k=mid ;k<n-1 ; k++)
      {
        if(arr[k]<arr[k+1])
        {
          int t = arr[k];
          arr[k]=arr[k+1];
          arr[k+1]=t;
        }
      }
    }
    for(int m=0 ; m<n ; m++)
      System.out.print(arr[m]+" ");
  }
}