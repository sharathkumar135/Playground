import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner in =new Scanner(System.in);
      int n =in.nextInt();
      int temp[]=new int[n];
      int arr[] = new int[n];
      for(int i=0;i<n;i++)
        arr[i]=in.nextInt();
      int m=in.nextInt();
      Arrays.sort(arr);
      int k=0;
      for(int j=n-1;j>=0;j--)
      {
        temp[k]=arr[j];
        k++;
      }
      System.out.println(temp[m-1]);
    }   
}