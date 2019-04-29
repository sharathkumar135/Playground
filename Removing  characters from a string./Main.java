import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String str  = in.nextLine();
    int len = str.length();
    String sub = in.nextLine();
    int slen = sub.length();
    StringBuilder sb = new StringBuilder(str);
    StringBuilder sb1 = new StringBuilder(sub);
    for(int i = 0; i<slen ; i++)
    {
      for(int j =0 ; j<len ; j++)
      {
        if(sb.charAt(j)==sb1.charAt(i))
          sb.setCharAt(j,'*');
      }
    }
    for(int k=0 ; k<len ; k++)
    {
      if(sb.charAt(k)!='*')
        System.out.print(sb.charAt(k));
    }
  }
}