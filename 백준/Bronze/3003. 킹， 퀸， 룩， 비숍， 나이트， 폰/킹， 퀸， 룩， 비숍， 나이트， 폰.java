import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        // 11228
        int k=1;
        int q=1;
        int l=2;
        int b=2;
        int n=2;
        int p=8;
        StringTokenizer st=new StringTokenizer(s);
        int k2=Integer.parseInt(st.nextToken());
        int q2=Integer.parseInt(st.nextToken());
        int l2=Integer.parseInt(st.nextToken());
        int b2=Integer.parseInt(st.nextToken());
        int n2=Integer.parseInt(st.nextToken());
        int p2=Integer.parseInt(st.nextToken());
        System.out.print((k-k2)+" "+(q-q2)+" "+(l-l2)+" "+(b-b2)+" "+(n-n2)+" "+(p-p2));
        
    }
}