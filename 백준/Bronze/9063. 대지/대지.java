import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int N=Integer.parseInt(br.readLine());
     int arr1[]=new int[N];
     int arr2[]=new int[N];
    
     
        for(int i=0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            arr1[i]=Integer.parseInt(st.nextToken());
            arr2[i]=Integer.parseInt(st.nextToken());
        }
     int min1=arr1[0];
     int max1=arr1[0];
     int min2=arr2[0];
     int max2=arr2[0];
     for(int a:arr1) {
    	 if(min1>a)
    		 min1=a;
    	 if(max1<a)
    		 max1=a;
     }
     for(int a:arr2) {
    	 if(min2>a)
    		 min2=a;
    	 if(max2<a)
    		 max2=a;
     }
     if(N==1)
         System.out.println("0");
     else
     System.out.println((max1-min1)*(max2-min2));
    }
}