import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int A=Integer.parseInt(st.nextToken());
        int B=Integer.parseInt(st.nextToken());
        int C=Integer.parseInt(st.nextToken());
        if(A*B-C<0)
            System.out.println(0);
        else
        System.out.println(A*B-C);
    }
}