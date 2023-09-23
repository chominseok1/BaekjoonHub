import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String v="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String s=br.readLine(); // 받은 라인
        StringTokenizer st=new StringTokenizer(s);
        String num=st.nextToken();
        int n=Integer.parseInt(st.nextToken());
        int answer=0;
        for(int i=0;i<num.length();i++){
            answer+=v.indexOf(num.charAt(num.length()-i-1))*Math.pow(n,i);
        }
        System.out.println(answer);
    }
}