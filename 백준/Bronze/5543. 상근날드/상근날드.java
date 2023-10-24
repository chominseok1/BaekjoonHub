import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int b[]=new int[3];
        int c[]=new int[2];
        for(int i=0;i<b.length;i++){
            b[i]=Integer.parseInt(br.readLine());
        }
        for(int j=0;j<c.length;j++){
            c[j]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(b);
        Arrays.sort(c);
        System.out.println(b[0]+c[0]-50);
    }
}