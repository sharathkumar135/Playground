import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in =new Scanner(System.in);
      char ch = in.next().charAt(0);
      int key = in.nextInt();
      if(ch>='a' && ch<='z')
      {
        int off=ch-'a';
        off=(key-off)%26;
        char ch1=(char)(off+'a');
        System.out.println('z');
      }
      if(ch>='A' && ch<='Z')
      {
        int off1=ch-'A';
        off1=(off1-key)%26;
        char ch2=(char)(off1+'A');
        System.out.println(ch2);
      }
    }
}