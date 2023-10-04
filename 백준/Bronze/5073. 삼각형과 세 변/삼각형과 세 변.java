import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     while(true){
         String s=br.readLine();
         if(s.equals("0 0 0"))
        	 break;
         StringTokenizer st=new StringTokenizer(s);
         int a=Integer.parseInt(st.nextToken());
         int b=Integer.parseInt(st.nextToken());
         int c=Integer.parseInt(st.nextToken());
        
         if(a==b&& b==c && a==c)
        	 System.out.println("Equilateral");
         if((a==b&& a!=c && b!=c) || (a==c && a!=b && c!=b) || (b==c && b!=a && c!=a))
         {
        	 if(a>b && a>c && b+c<=a) {
            	 
        		 System.out.println("Invalid");
         }
        	 else if(b>a && b>c && a+c<=b) {
             	
        		 System.out.println("Invalid");
         }
        	 else if(c>b && c>a && b+a<=c) {
            	 
        		 System.out.println("Invalid");
         }
        	 else
        	 System.out.println("Isosceles");
         }
         if(a!=b && a!=c && b!=c) {
        	 if(a>b && a>c && b+c<=a) {
            	 
        		 System.out.println("Invalid");
         }
        	 else if(b>a && b>c && a+c<=b) {
        	
        		 System.out.println("Invalid");
         }
        	 else if(c>b && c>a && b+a<=c) {
        	 
        		 System.out.println("Invalid");
         }
        	 
         else
        	 System.out.println("Scalene");
         }
        	 
        	 
         
     }
    }
}