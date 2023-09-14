import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        StringTokenizer st=new StringTokenizer(s);
        int N=Integer.parseInt(st.nextToken());
        int X=Integer.parseInt(st.nextToken());
        int[] arr=new int[N];
        String array=br.readLine();
        StringTokenizer str=new StringTokenizer(array);
        for(int i=0;i<N;i++)
        {
            arr[i]=Integer.parseInt(str.nextToken());
        }
        for(int a:arr)
        {
            if(a<X)
                System.out.print(a+" ");
        }
    }
}