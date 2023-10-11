import java.io.*;
import java.util.*;
public class Main{
 public static void main(String args[]) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	     int n=Integer.parseInt(br.readLine());
	     int[] arr=new int[n+1];
	     for(int i=0;i<=n;i++) {
	    	 if(i==0||i==1)
	    		 arr[i]=i;
	    	 else
	    		 arr[i]=arr[i-2]+arr[i-1];
	     }
	       System.out.println(arr[n]);
	
 }
}