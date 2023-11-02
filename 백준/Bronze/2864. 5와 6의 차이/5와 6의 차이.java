import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st=new StringTokenizer(br.readLine());
		 String s1=st.nextToken();
		 String s2=st.nextToken();
		 
		 String s11=s1.replaceAll("5", "6");
		 String s22=s2.replaceAll("5", "6");
		 int Max=Integer.parseInt(s11)+Integer.parseInt(s22);
		 s1=s1.replaceAll("6", "5");
		 s2=s2.replaceAll("6", "5");
		 int Min=Integer.parseInt(s1)+Integer.parseInt(s2);
		 System.out.print(Min+" "+Max);
    }
}