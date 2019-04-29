import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      
      String temp = in.nextLine();
      int len =str.length();
      str=str.concat(str);
      if(str.contains(temp))
         System.out.println("Yes");
      else
        System.out.println("No");
      
      //System.out.println(str);
    }
}