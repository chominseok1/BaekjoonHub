import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException{
     BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	       String s="";
		while((s=br.readLine())!=null)
		 { 
	        bw.write(s);
	        bw.newLine();
		    bw.flush();
	       }
        
    }
}