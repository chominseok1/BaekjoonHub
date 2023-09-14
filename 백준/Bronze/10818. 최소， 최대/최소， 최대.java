import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
       
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()); // 배열 크기
        int[] arr=new int[N];
        String s=br.readLine();
        StringTokenizer st=new StringTokenizer(s);
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            
        }
        int max=arr[0];
        int min=arr[0];
        for(int a:arr)
        {
            if(a>max)
                max=a;
            if(a<min)
                min=a;
        }
        System.out.print(min+" "+max);
    }
}