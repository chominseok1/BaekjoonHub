import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int x=Integer.parseInt(st.nextToken());
        int max=0;
        int arr[]=new int[n];
        String s=br.readLine();
        int index=0;
        st=new StringTokenizer(s);
        while(st.hasMoreTokens()) {
        	arr[index]=Integer.parseInt(st.nextToken());
        	index++;
        }
        int a=0;
        for(int i=0;i<n;i++) {
        	for(int j=i+1;j<n;j++) {
        		for(int k=j+1;k<n;k++) {
        		 a=arr[i]+arr[j]+arr[k];
        		 
        		 if(max<a&&a<=x)
        			 max=a;
        		}
        	}
        }
        System.out.println(max);
    }
}