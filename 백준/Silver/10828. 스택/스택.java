import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        int n=Integer.parseInt(br.readLine());
	        Stack<Integer> stack=new Stack<>();
	        String s="";
	        StringBuffer sb=new StringBuffer();
	        for(int i=0;i<n;i++){
	            s=br.readLine();
	        if(s.startsWith("push")) {
                StringTokenizer st=new StringTokenizer(s);
                st.nextToken();
                int a=Integer.parseInt(st.nextToken());
                stack.push(a);
                
	        }
	        else {
	            switch(s){
	                
	                case "pop" :
	                     if(stack.isEmpty())
	                         sb.append("-1\n");
	                     else
	                         sb.append(stack.pop()+"\n");
	                    break;
	                case "size" :
	                    sb.append(stack.size()+"\n");
	                    break;
	                    
	                 case "empty" :
	                     if(stack.isEmpty())
	                         sb.append("1\n");
	                     else
	                         sb.append("0\n");
	                    break;
	                 case "top" :
	                     if(stack.isEmpty())
	                         sb.append("-1\n");
	                     else
	                         sb.append(stack.peek()+"\n");
	                    break;
	            }
	        }
	        }
	        System.out.println(sb.toString());
    }
}