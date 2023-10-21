import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String s=br.readLine();
            if(s.equals("0 0 0"))
                break;
            else{
                int a=0;
                int b=0;
                int c=0;
                StringTokenizer st=new StringTokenizer(s);
                a=Integer.parseInt(st.nextToken());
                b=Integer.parseInt(st.nextToken());
                c=Integer.parseInt(st.nextToken());
                if(c*c==a*a+b*b)
                    System.out.println("right");
                else if(a*a==b*b+c*c)
                     System.out.println("right");
                else if(b*b==a*a+c*c)
                     System.out.println("right");
                else
                    System.out.println("wrong");
            }
        }
    }
}