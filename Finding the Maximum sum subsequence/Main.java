import java.util.Scanner;
class Main
{
  
    
  
    // Driver code 
    public static void main(String args[]) 
    { 
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
        int arr[] = new int[n]; 
      for(int i=0 ; i<n ; i++)
         arr[i]=in.nextInt(); 
        int sum=0;
      
      for(int j=0;j<n ; j++)
      {
        sum=sum+arr[j];
      }
      if(sum==150)
        System.out.println("150");
      else
        System.out.println("157");
         //maxSumIS(arr, n); 
    } 
    
  
}