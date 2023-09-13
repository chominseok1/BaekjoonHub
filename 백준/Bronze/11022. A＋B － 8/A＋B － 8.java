import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        int a=0;
        int b=0;
        int answer=0;
        for(int i=1;i<=T;i++)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            while(st.hasMoreTokens())
            {
              a=Integer.parseInt(st.nextToken());
              b=Integer.parseInt(st.nextToken());
            }
            answer=a+b;
            System.out.println("Case #"+i+": "+a+" + "+b+" = "+answer);
        }
        /*
         Case #1: 1 + 1 = 2
        Case #2: 2 + 3 = 5
        Case #3: 3 + 4 = 7
        Case #4: 9 + 8 = 17
        Case #5: 5 + 2 = 7
        */
    }
}