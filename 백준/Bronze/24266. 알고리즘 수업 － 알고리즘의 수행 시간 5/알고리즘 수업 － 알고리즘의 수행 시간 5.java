import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long n=Long.parseLong(br.readLine());
        long answer=(long)Math.pow(n,3);
        System.out.println(n*n*n);
        System.out.println(3);
    }
}