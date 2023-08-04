import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        String s="";
        for(int i=0;i<num;i++)
        {
           s=br.readLine();
           System.out.print(s.charAt(0));
           System.out.println(s.charAt(s.length()-1)); 
        }
    }
}