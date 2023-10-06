import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int aa=(int)Math.pow(a,2);
        int b=Integer.parseInt(st.nextToken());
        int bb=(int)Math.pow(b,2);
        int c=Integer.parseInt(st.nextToken());
        int cc=(int)Math.pow(c,2);
        int d=Integer.parseInt(st.nextToken());
        int dd=(int)Math.pow(d,2);
        int e=Integer.parseInt(st.nextToken());
        int ee=(int)Math.pow(e,2);
        int answer=(aa+bb+cc+dd+ee)%10;    
        System.out.println(answer);
         
    }
}