import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        // for 문 통일
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        for(int i=1;i<=N;i++) // 줄수 
        {
            
            for(int j=i;j<=N-1;j++) // 띄어쓰기 몇번하는지 ex) N:5 4 3 2 1
            {
                
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++) // 별찍기 ex) k==1 i==1 한번찍음
            {
                System.out.print("*");
            }
            
            
            System.out.println();
        }
    }
}