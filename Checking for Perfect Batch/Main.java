import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in =new Scanner(System.in);
    int n =in.nextInt();
    int arr[] = new int[n];
    for(int i =0;i<n ;i++)
    {
      arr[i]=in.nextInt();
    }
    sum(n,arr);
  }
  public static void sum(int n,int arr[])
  {
    int flag=0;
    int sum1=arr[0]+arr[1]+arr[2];
    for(int j=3;j<n ;j=j+3)
    {
      int sum2=arr[j]+arr[j+1]+arr[j+2];
      if(sum1==sum2)
        flag=1;
    }
    if(flag!=1)
      System.out.println("Not a Perfect Batch");
    else
      System.out.println("Perfect Batch");
  }
}