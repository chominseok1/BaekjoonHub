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
	            if(s.startsWith("1")) {
	            	StringTokenizer st=new StringTokenizer(s);
	            	st.nextToken();
	            	int a=Integer.parseInt(st.nextToken());
	            	stack.push(a);
	            }
	            else {
	            	if(s.equals("2")) {
	            		if(stack.isEmpty())
	            			sb.append("-1\n");
	            		else {
	            			sb.append(stack.pop()+"\n");
	            		}
	            	}
	            	else if(s.equals("3")) {
	            		sb.append(stack.size()+"\n");
	            	}
	            	else if(s.equals("4")) {
	            		if(stack.isEmpty()) {
	            			sb.append("1\n");
	            		}
	            		else {
	            			sb.append("0\n");
	            		}
	            	}
	            	else {
	            		if(stack.isEmpty())
	            			sb.append("-1\n");
	            		else
	            			sb.append(stack.peek()+"\n");
	            	}
	            }
	        }
	        System.out.println(sb.toString());
    }
}