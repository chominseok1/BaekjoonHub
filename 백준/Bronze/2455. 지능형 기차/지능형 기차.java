import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	       int sum=0;
	       int arr[]=new int[4];
	        for(int i=0;i<4;i++){
	            StringTokenizer st=new StringTokenizer(br.readLine());
	            int a=Integer.parseInt(st.nextToken()); // 내린사람
	       
	            int b=Integer.parseInt(st.nextToken()); // 탄사람
	            
	            sum=sum-a+b;
	            arr[i]=sum;
	           
	        }
	        Arrays.sort(arr);
	        System.out.println(arr[3]);
    }
}