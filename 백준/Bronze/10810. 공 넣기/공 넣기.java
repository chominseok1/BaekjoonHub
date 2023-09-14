import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine(); // 첫줄 받기
        StringTokenizer st=new StringTokenizer(s);
        int N=Integer.parseInt(st.nextToken()); //바구니 갯수
        int M=Integer.parseInt(st.nextToken()); // 공을 넣을 횟수
        String ss="";
        int i=0;
        int j=0;
        int k=0;
        int[] arr=new int[N];
        for(int a=0;a<M;a++)
        {
            ss=br.readLine();
            StringTokenizer st2=new StringTokenizer(ss);
            i=Integer.parseInt(st2.nextToken())-1;
            j=Integer.parseInt(st2.nextToken())-1;
            k=Integer.parseInt(st2.nextToken());
            for(int b=i;b<=j;b++){
                arr[b]=k;
            }
        }
        for(int n:arr){
            System.out.print(n+" ");
        }
        
    }
}