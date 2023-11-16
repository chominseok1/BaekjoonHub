import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        long arr[]=new long[n]; // 배열
        long arr2[]=new long[m]; // 나머지 개수 
        st=new StringTokenizer(br.readLine());
        arr[0]=Long.parseLong(st.nextToken());  
        for(int i=1;i<n;i++){
         arr[i]=arr[i-1]+Long.parseLong(st.nextToken());
           
        }
        long answer=0;
        for(int i=0;i<n;i++){
            int nam=(int)(arr[i]%m);
            if(nam==0)
                answer++;
            arr2[nam]++; // 해당 나머지 갯수 카운트
        }
        // 정답에 더하기 3C2 2C2
        for(int i=0;i<m;i++){
            if(arr2[i]>1)
            answer+=(arr2[i]*(arr2[i]-1)/2);
        }
        System.out.println(answer);
    }
}