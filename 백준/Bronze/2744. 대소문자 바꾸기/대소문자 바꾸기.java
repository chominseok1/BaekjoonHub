import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[])throws IOException{
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        String s=br.readLine();
	        char a;
	        for(int i=0;i<s.length();i++){
	            a=s.charAt(i);
	            if(a>=97){
	                a=Character.toUpperCase(a);
	               
	            }
	            else if(a<97){
	                a=Character.toLowerCase(a);
	                
	            }
	            System.out.print(a);
	        }
    }
}