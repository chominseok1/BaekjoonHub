import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        /*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine()); // 총 금액
        int N=Integer.parseInt(br.readLine()); // 물건의 종류 
        int price=0;
        int a=0; // 물건 가격
        int b=0; // 물건 갯수
        for(int i=0;i<N;i++){
            a=Integer.parseInt(br.readLine());
            b=Integer.parseInt(br.readLine());
            price+=(a*b);
        }
        if(price==T)
            System.out.println("Yes");
        else
            System.out.println("No");*/
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        int N=scan.nextInt();
        int price=0;
        int a=0;
        int b=0;
        for(int i=0;i<N;i++)
        {
            a=scan.nextInt();
            b=scan.nextInt();
            price+=(a*b);
        }
        if(price==T)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}