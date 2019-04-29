import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in =new Scanner(System.in);
    String str = in.nextLine();
    String findStr =in.nextLine();
    int N=str.length();
    int M=findStr.length();
    int res=0;
     for (int i = 0; i <= N - M; i++) { 
            /* For current index i, check for  
        pattern match */
            int j;             
            for (j = 0; j < M; j++) { 
                if (str.charAt(i + j) != findStr.charAt(j)) { 
                    break; 
                } 
            } 
  
            // if pat[0...M-1] = txt[i, i+1, ...i+M-1]  
            if (j == M) {                 
                res++;                 
                j = 0;                 
            }             
        }     

System.out.println(res);

  } 
}