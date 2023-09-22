import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        
        int a=0;
        int b=0;
        for(int i=0;i<N;i++){
            StringTokenizer s=new StringTokenizer(br.readLine());
            a=Integer.parseInt(s.nextToken());
            b=Integer.parseInt(s.nextToken());
            int result=1;
            for(int j=1;j<=b;j++)
            {
                result=result*a%10;
                
           
            }
            if(result==0){
                result=10;
                System.out.println(result);
            }
            else
            {
             System.out.println(result); 
            }
            
        }
    }
}