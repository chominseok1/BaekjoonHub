import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="";
        while(true)
        {
            s=br.readLine();
            if(s.equals("0 0"))
               break;
            else{
                StringTokenizer st=new StringTokenizer(s);
                int a=Integer.parseInt(st.nextToken());
                int b=Integer.parseInt(st.nextToken());
                if(b%a==0)
                    System.out.println("factor");
                else if(a%b==0)
                    System.out.println("multiple");
                else
                    System.out.println("neither");
            }
           
        }
        
    }
}