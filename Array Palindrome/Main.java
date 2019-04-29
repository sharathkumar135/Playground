import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] =new int[n];
      int k=0;
      int rep[] = new int[n];
      for(int i=0 ; i<n ; i++)
        arr[i]=in.nextInt();
      for(int j=n-1 ; j>=0 ; j--)
      {
        rep[j] = arr[k];
        k++;
      }
      if(Arrays.equals(arr,rep))
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}