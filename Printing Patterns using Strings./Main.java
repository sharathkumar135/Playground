import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    StringBuilder sb = new StringBuilder(str);
    int len = sb.length();
    int h = len/2;
    StringBuilder fh=new StringBuilder();
    StringBuilder sh=new StringBuilder();
   // String sh = "";
    for(int i = 0 ; i<h ; i++)
      fh.append(str.charAt(i));
    for(int j = h ; j<len ; j++)
      sh.append(str.charAt(j));
    sh.append(fh);
   
    for(int k=0 ; k<sh.length() ; k++)
    {
      for(int n=len-1 ; n>k ; n--)
        System.out.print(" ");
      for(int m=0 ; m<=k ; m++)
        System.out.print(sh.charAt(m));
      System.out.println();
    }
    
    
  }
}