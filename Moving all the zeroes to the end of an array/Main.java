import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in =new Scanner(System.in);
      int n =in.nextInt();
      int arr [] =new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      move(arr,n);
    }
  public static void move(int arr[],int n)
  {
    int cnt=0;
    int a[]=new int[n];
    int k=0;
    for(int i=0; i<n ;i++)
    {
      if(arr[i]>0)
      {
        a[k]=arr[i];
        k=k+1;
        cnt=cnt+1;
      }
    }
    int num=n-cnt;
    int p=0;
    for(int m=0;m<k;m++)
    {
      arr[p]=a[m];
      p++;
    }
    for(int x=p;x<n;x++)
      arr[p]=0;
    for(int y=0;y<n;y++)
      System.out.print(a[y]+" ");
  }
}