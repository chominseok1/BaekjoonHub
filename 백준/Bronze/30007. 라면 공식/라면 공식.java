import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken()); // 계수
        int b=Integer.parseInt(st.nextToken()); // 물
        int c=Integer.parseInt(st.nextToken()); // 갯수
        System.out.println(a*c-a+b);
        }
    }
}