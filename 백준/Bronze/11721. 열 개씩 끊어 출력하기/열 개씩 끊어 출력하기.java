import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(count==10){
                System.out.println();
                count=0;
            }
            System.out.print(s.charAt(i));
            count++;
        }
    }
}