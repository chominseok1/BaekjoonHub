import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine())-1; // 처음에 들어오는 숫자 
        int count=1;
        int cycle=6;
        while(N>0){
            count++;
            N-=cycle;
            cycle+=6;
        }
        System.out.println(count);
    }
}