import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String str= in.nextLine();
    StringBuilder sb = new StringBuilder(str);
    int n =  str.length();
    for(int i=0 ; i<n ; i++)
    {
      if((sb.charAt(i)=='a')||(sb.charAt(i)=='e')||(sb.charAt(i)=='i')||(sb.charAt(i)=='o')||(sb.charAt(i)=='u'))
      {
        sb.setCharAt(i,'*');
      }
    }
    for(int j=0 ; j<n ; j++)
    {
      if(sb.charAt(j)!='*')
        System.out.print(sb.charAt(j));
    }
    
  }
}