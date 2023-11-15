import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st=new StringTokenizer(br.readLine());
	        int n=Integer.parseInt(st.nextToken()); // 배열 길이 
	        int r=Integer.parseInt(st.nextToken()); // 반복 횟수
	        int arr[]=new int[n+1];
	        st=new StringTokenizer(br.readLine());
	        for(int i=1;i<n+1;i++){
	            arr[i]=Integer.parseInt(st.nextToken());
	        }
	        // 구간합 배열 만들기 !
	        // S[i]=S[i-1]+arr[i]; -> S[4]=arr[0]~arr[4]까지의 합
	        int S[]=new int[n+1];
	        for(int i=1;i<n+1;i++){
	            if(i==1){
	                S[i]=arr[i];
	            }
	            else{
	                S[i]=S[i-1]+arr[i];
	            }
	        }
	        int a=0; // 받을 구간
	        int b=0; // 받을 구간 
	        for(int i=0;i<r;i++){
	            st=new StringTokenizer(br.readLine());
	            a=Integer.parseInt(st.nextToken());
	            b=Integer.parseInt(st.nextToken());
	           if(a==1) {
	        	   System.out.println(S[b]);
	           }
	           else
	            System.out.println(S[b]-S[a-1]);
	        }
    }
}