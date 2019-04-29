import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in =new Scanner(System.in);
      String str=in.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int st=0;
      int ls=sb.length();
      int ls1=ls-1;
      reverse_string(str,st,ls1);
    }
    // Function to reverse a string
    public static void reverse_string(String sb, int start_idx, int end_idx)
    {
        // Type your code here
      
      
String[] split = sb.split(" ");
String result = "";
for (int i = split.length - 1; i >= 0; i--) {
  result += (split[i] + " ");
}
System.out.println(result.trim());
    }
}