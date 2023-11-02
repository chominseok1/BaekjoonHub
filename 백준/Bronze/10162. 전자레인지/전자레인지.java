import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        int n=Integer.parseInt(br.readLine());
	        int arr[]={300,60,10};
	        for(int i=0;i<arr.length;i++){
	        	if(n%10!=0) {
	        		System.out.println(-1);
	        		break;
	        	}
	        	else {
	        	int answer=n/arr[i];
	            n=n%arr[i];
	            System.out.print(answer+" ");
	        	}
	            
	        }
    }
}