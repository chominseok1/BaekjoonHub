import java.io.*;
import java.util.*;
public class Main {
 public static void main(String[] args) throws IOException {
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     long a=Integer.parseInt(br.readLine());
     long answer=3*a+a;
     System.out.println(answer);
     
 }
}