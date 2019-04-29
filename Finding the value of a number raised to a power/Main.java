import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int exp = in.nextInt();
      int sum = base;
      int i=1;
      while(i<exp)
      {
        sum =sum * base;
       // System.out.println(sum);
        i++;
      }
      System.out.println(sum);
    }
}