import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner  in =new Scanner(System.in);
      String sb= in.nextLine();
      String rev="";
      int len =sb.length();
      
      for ( int i = len- 1; i >= 0; i-- )
         rev = rev + sb.charAt(i);
 
      if (sb.equals(rev))
         System.out.println("Yes");
      else
         System.out.println("No");
      
      
      
    } 
}