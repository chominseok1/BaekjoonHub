import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()); 
        int m=Integer.parseInt(st.nextToken());
        String s="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String answer="";
        while(N>=m)
        {
            answer+=s.charAt(N%m);
            N=N/m;
        }
        answer+=s.charAt(N); 
        int index=answer.length()-1;
        for(int i=0;i<answer.length();i++)
        {
            System.out.print(answer.charAt(index));
            index--;
        }
        
    }
}