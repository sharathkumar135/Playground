import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr [] = new int[n];
      for(int i=0; i< n ; i++)
        arr[i]= in.nextInt();
       int count=0;
      int temp[]=new int[10];
      int k=0;
      for(int j=0 ; j<n ; j++)
      {
       
        if(arr[j]==0)
        {
          temp[k]=count;
          k++;
          count=0;
        }
         else
           count++;
        
        
      }
      Arrays.sort(temp);
      System.out.println(temp[temp.length-1]);
    }
}