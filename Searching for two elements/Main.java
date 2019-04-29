import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in =new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      for(int i =0 ;i< n; i++)
      {
        arr[i]=in.nextInt();
      }
      int ele1 = in.nextInt();
      int ele2 = in.nextInt();
      int flag1=0;
      int flag2=0;
      int pos1=0;
      int pos2=0;
      for(int j = 0;j< n; j++)
      {
        if(ele1==arr[j])
        {
          flag1=1;
          System.out.println(j);
         // pos1=j;
        break;
        }
        
      }
      for(int j = 0;j< n; j++)
      {
        if(ele2==arr[j])
        {
          flag2=1;
          System.out.println(j);
          
          //pos2=j;
        break;
        }
       
      }
      if(flag1==0)
        System.out.println("-1");
      
      if(flag2==0)
        System.out.println("-1");
      
      
    }
}