import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	       
	        while(true)
	        {
	             List<Integer> list=new ArrayList<>();
	            int N=Integer.parseInt(br.readLine());
	            int sum=0;
	            if(N==-1){
	                break;
	            }
	            else{
	                for(int i=1;i<N;i++){
	                    if(N%i==0)
	                        list.add(i);
	                    
	                }
	                for(int i=0;i<list.size();i++){
	                    sum+=list.get(i);
	                    
	                }
	                if(N==sum) {
	                System.out.print(sum+" = 1");
	                for(int a=1;a<list.size();a++) {
	                	System.out.print(" + "+list.get(a));
	                }
	                 System.out.println();
	                }
	                else
	                	System.out.println(N+" is NOT perfect.");
	            }
	        }
    }
}