import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int x=Integer.parseInt(st.nextToken());
        int y=Integer.parseInt(st.nextToken());
        int w=Integer.parseInt(st.nextToken());
        int h=Integer.parseInt(st.nextToken());
        int a=w-x;
        int b=h-y;
        int min=x;
        if(min>y)
            min=y;
        if(min>a)
            min=a;
        if(min>b)
            min=b;
        System.out.println(min);
        
    }
}