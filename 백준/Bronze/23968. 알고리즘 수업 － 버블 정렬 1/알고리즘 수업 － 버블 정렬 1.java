import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException{
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
	        String s="";
	        for(int i=0;i<N-1;i++){
	            for(int j=0;j<N-1-i;j++){
	                if(arr[j]>arr[j+1]){
	                    
	                    int temp=arr[j];
	                    arr[j]=arr[j+1];
	                    arr[j+1]=temp;
	                    count++;
		                if(count==c) {
		                    s=arr[j]+" "+arr[j+1];
		                    break;
	                }
	                
	                
	              
	                }
	                
	            }
	           
	        }
	        if(count<c)
                System.out.println(-1);
            else
                System.out.println(s);
    }
}
