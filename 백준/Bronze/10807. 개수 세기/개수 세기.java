import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String s=br.readLine();
        StringTokenizer st=new StringTokenizer(s); 
        int t=Integer.parseInt(br.readLine()); // 세번째 숫자
        int[] arr=new int[N];
        int count=0;
        for(int i=0;i<N;i++)
        {
            arr[i]=Integer.parseInt(st.nextToken());
        }
        for(int c:arr){
            if(c==t)
                count++;
        }
        System.out.println(count);
    }
}