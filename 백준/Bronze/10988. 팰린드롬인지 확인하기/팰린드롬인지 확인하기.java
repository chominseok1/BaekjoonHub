import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        // 문자 받은거 스캐너 대체
        String st=br.readLine();
        StringBuffer sb=new StringBuffer(st);
        String st2=sb.reverse().toString();
        if(st.equals(st2))
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
        
        
    }
}