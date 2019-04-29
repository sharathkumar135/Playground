import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in =new Scanner(System.in);
    int n = in.nextInt();
    int arr[] =new int[n];
    for(int index=0 ; index<n ; index++)
    {
      arr[index]=in.nextInt();
    }
    maxi(arr,n);
  }
  public static void maxi(int arr[],int n)
  {
    int max=0;
    int pos=0;
    for(int i=0;i<n ; i++)
    {
      if(arr[i]>max)
      {
        max=arr[i];
        pos=i;
      }
    }
    System.out.println(pos);
  }
}