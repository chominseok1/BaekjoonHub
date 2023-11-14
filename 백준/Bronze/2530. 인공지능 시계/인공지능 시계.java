import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int h=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int s=Integer.parseInt(st.nextToken());
        
        int p=Integer.parseInt(br.readLine());
        s+=p;
        m+=s/60;
        s=s%60;
        h+=m/60;
        m=m%60;
        h=h%24;
        System.out.println(h+" "+m+" "+s);
    }
}