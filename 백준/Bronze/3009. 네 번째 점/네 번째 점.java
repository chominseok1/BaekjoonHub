import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s1=br.readLine();
        String s2=br.readLine();
        String s3=br.readLine();
        StringTokenizer st=new StringTokenizer(s1);
        int x1=Integer.parseInt(st.nextToken());
        int y1=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(s2);
        int x2=Integer.parseInt(st.nextToken());
        int y2=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(s3);
        int x3=Integer.parseInt(st.nextToken());
        int y3=Integer.parseInt(st.nextToken());
        
        int x4=0;
        int y4=0;
        if(x1==x2)
            x4=x3;
        else if(x1==x3)
            x4=x2;
        else if(x2==x3)
            x4=x1;
         if(y1==y2)
            y4=y3;
        else if(y1==y3)
            y4=y2;
        else if(y2==y3)
            y4=y1;
        System.out.println(x4+" "+y4);
        
    }
}