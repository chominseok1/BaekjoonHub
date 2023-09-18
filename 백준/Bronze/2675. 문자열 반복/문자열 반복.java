import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	     int T=Integer.parseInt(br.readLine());
	     String s=""; // 반복횟수
	     String p=""; //출력 문자열
	     int a=0; // 3
	     String ss=""; // abc
	     
	     for(int i=0;i<T;i++) {
	    	 s=br.readLine();
	    	 StringTokenizer st=new StringTokenizer(s);
	    	 a=Integer.parseInt(st.nextToken());
	    	 ss=st.nextToken();
	    	 for(int j=0;j<ss.length();j++) {
	    		for(int k=0;k<a;k++) {
	    			System.out.print(ss.charAt(j));
	    		}
	    		
	    	 }
	    	 System.out.println();
	     }
    }
}