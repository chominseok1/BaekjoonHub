import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        int c=Integer.parseInt(br.readLine());
        long d=a*b*c;
        String s=String.valueOf(d);
        for(int i=0;i<10;i++){
            int count =0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)-'0'==i)
                    count++;
            }
            System.out.println(count);
        }
    }
}