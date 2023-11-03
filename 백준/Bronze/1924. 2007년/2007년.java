import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int m=Integer.parseInt(st.nextToken());
        int d=Integer.parseInt(st.nextToken());
        int[] Month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int total=d;
        for(int i=0;i<m-1;i++){
            total+=Month[i];
        }
        System.out.println(day[total%7]);
    }
}