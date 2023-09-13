import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int a=0;
        int b=0;
        int c=0;
       
        
       while(true)
       {
           StringTokenizer st=new StringTokenizer(br.readLine());
           a=Integer.parseInt(st.nextToken());
           b=Integer.parseInt(st.nextToken());
           c=a+b;
           if(a==0&b==0)
               break;
           System.out.println(c);
       }
        
    }
}