import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        int M=Integer.parseInt(br.readLine()); 
	        int N=Integer.parseInt(br.readLine());
	        List<Integer> list=new ArrayList<>();
	        for(int i=M;i<=N;i++){
	        	boolean check=false;
	            for(int j=2;j<i;j++){
	                if(i%j==0)
	                {
	                	check=true;
	                    break;
	                    
	                }
	                 
	            }
	            if(check==false&&i!=1) {
	            	list.add(i);
	            }
	        }
	        if(list.size()==0) {
	        	System.out.println("-1");
	        }
	        else {
	        int min=list.get(0);
	        int sum=0;
	        for(int a:list) {
	        	if(min>a)
	        	{
	        		min=a;
	        	}
	        }
	        for(int a:list) {
	        	sum+=a;
	        }
	        System.out.println(sum);
	        System.out.println(min);
	        }
    }
}