import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        int a=Integer.parseInt(br.readLine());
	        int b=Integer.parseInt(br.readLine());
	        List<Integer> list=new ArrayList<>();
	        int sum=0;
	        int min=-1;
	        for(int i=a;i<=b;i++){
	            for(int j=1;j<=i;j++){
	                if(j*j==i) {
	                	list.add(i);
	                }
	            }
	        }
	        if(list.isEmpty()) {
	        	System.out.println(-1);
	        }
	        else {
	       for(int l:list) {
	    	   sum+=l;
	       }
	       System.out.println(sum);
	       System.out.println(list.get(0));
	        }
    }
}