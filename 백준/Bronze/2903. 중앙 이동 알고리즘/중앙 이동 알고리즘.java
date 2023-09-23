import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int a=2;
        int b=0;
        for(int i=0;i<n;i++)
        {
            a=a+a-1;
            b=a*a;
        }
        System.out.println(b);
 }
}