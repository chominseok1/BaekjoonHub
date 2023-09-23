import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            int number=Integer.parseInt(br.readLine());
            System.out.print(number/25+" ");
            number=number%25;
            System.out.print(number/10+" ");
            number=number%10;
            System.out.print(number/5+" ");
            number=number%5;
            System.out.print(number/1+" ");
        }
    }
}