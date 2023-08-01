import java.util.*;
public class Main
{
    public static void main(String args[])
    {
         Scanner scan=new Scanner(System.in);
      int N=scan.nextInt();
      
      // 첫 for문  첫 별 5줄
      for(int i=1;i<=N;i++)
      {
          for(int j=0;j<N-i;j++)
          {
              System.out.print(" ");
          }
          for(int k=0;k<2*i-1;k++)
          {
              System.out.print("*");
          }
          System.out.println();
          
      }
      for(int i=1;i<=N-1;i++)
      {
          for(int j=0;j<i;j++)
          {
              System.out.print(" ");
          }
          for(int k=0;k<(N-i)*2-1;k++)
          {
              System.out.print("*");
          }
          System.out.println();
      }
  }
}