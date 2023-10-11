import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()); // 숫자 받기
        int result=666;
        int c=1;
        
        while(c!=N){
            result++;
            if(Integer.toString(result).contains("666"))
                c++;
        }
        System.out.println(result);
    }
}