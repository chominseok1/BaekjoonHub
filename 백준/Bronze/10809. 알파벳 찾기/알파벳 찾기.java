import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="abcdefghijklmnopqrstuvwxyz";
        String ss=br.readLine(); // 입력값
        String a=""; 
        for(int i=0;i<s.length();i++)
        {
            a=String.valueOf(s.charAt(i));
            if(ss.contains(a))
                System.out.print(ss.indexOf(a)+" ");
            else 
                System.out.print("-1"+" ");
        }
    }
}