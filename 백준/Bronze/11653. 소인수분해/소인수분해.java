import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int i=2;
        while(N>=i){
            if(N%i==0){
                System.out.println(i);
                N /= i;
            }
            else
            {
                i++;
            }
        }
    }
}