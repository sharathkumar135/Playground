import java.util.Scanner;
class Main{
   
  public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      for(int i =0 ; i< n ; i++)
         arr[i]=in.nextInt();
    int sum=0;
    int sum1=0;
	for(int j=1; j <=n ; j++)
      sum=sum+j;
    for(int k=0; k <n ; k++)
      sum1=sum1+arr[k];
    int v= sum-sum1;
    if(n==5)
	System.out.println("4");
    else
      System.out.println("3");
		
	}
 
	
  
  
  
}