import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner in =new Scanner(System.in);
    int n= in.nextInt();
    int arr[]=new int[n];
    for(int i=0 ; i<n ;i++)
    {
      arr[i]=in.nextInt();
    }
    int rot=in.nextInt();
    rightodd(arr,n,rot);
    lefteve(arr,n,rot);
    for(int i=0 ; i<n ;i++)
      System.out.print(arr[i]+" ");
  	}
  public static void rightodd(int arr[],int n,int rot)
  {
    int first=0;
    int last;
    if(n%2==1)
      last=n-1;
    else
      last=n-2;
    for(int i=0;i<rot; i++)
    {
      int temp1=arr[last];
      for(int j=last-2;j>=0;j=j-2)
        arr[j+2]=arr[j];
      arr[first]=temp1;
    }
  }
  public static void lefteve(int arr[] ,int n ,int rot)
  {
    int first=1;
    int last;
    if(n%2==0)
      last=n-1;
    else
      last=n-2;
    for(int i=0 ;i<rot; i++)
    {
      int temp2=arr[first];
      for(int j=3;j<n;j=j+2)
        arr[j-2]=arr[j];
      arr[last]=temp2;
    }
  }
}