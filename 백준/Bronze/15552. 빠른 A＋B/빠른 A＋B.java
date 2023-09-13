import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        int A=0;
        int B=0;
       
       
        for(int i=0;i<T;i++)
        {
          StringTokenizer st=new StringTokenizer(br.readLine());
           while(st.hasMoreTokens()){
            A=Integer.parseInt(st.nextToken());
            B=Integer.parseInt(st.nextToken());
           }
         
            bw.write(String.valueOf(A+B)+"\n");
           
        }
         bw.flush();
    }
}