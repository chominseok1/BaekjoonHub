import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        int n=Integer.parseInt(br.readLine());
	        int a=0;
	        for(int i=1;i<=n;i++){
	            a=2*i-1;
	            for(int j=0;j<n-i;j++){
	                System.out.print(" ");
	            }
	            for(int k=0;k<a;k++){
	                System.out.print("*");
	            }
	             
	            System.out.println();
	        }
    }
}