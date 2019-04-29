import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      String str2 = in.nextLine();
      int n = in.nextInt();
      str=str2;
      int l =str.length();
      for(int i=0; i<l ;i++)
      {
        if(str.charAt(i)!=' ')
          System.out.print(str.charAt(i));
        else
          System.out.println();
      }
      //System.out.println(str);
    }
}