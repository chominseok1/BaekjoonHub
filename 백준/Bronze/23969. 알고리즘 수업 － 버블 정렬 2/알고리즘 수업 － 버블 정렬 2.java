import java.io.*;
import java.util.*;
public class Main{
    public static void main(String arg[]) throws IOException{
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st=new StringTokenizer(br.readLine());
	        int N=Integer.parseInt(st.nextToken());
	        int c=Integer.parseInt(st.nextToken());
	        int arr[]=new int[N];
	        st=new StringTokenizer(br.readLine());
	        int count=0;
	        for(int i=0;i<N;i++){
	            arr[i]=Integer.parseInt(st.nextToken());
	        }
	        loop:
	        for(int i=0;i<N-1;i++){
	            for(int j=0;j<N-1-i;j++){
	                if(arr[j]>arr[j+1]){
	                    
	                    int temp=arr[j];
	                    arr[j]=arr[j+1];
	                    arr[j+1]=temp;
	                    count++;
	                    if(count==c)     	
		                    break loop;
	                }
	                
	                
	            }
	        }
	        if(count<c)
                System.out.println(-1);
            else {
            	for(int i=0;i<N;i++) {
                    if(i!=N-1)
            		System.out.print(arr[i]+" ");
                    else
                     System.out.print(arr[i]);   
            	}
            }
    }
}