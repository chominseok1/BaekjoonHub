import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int sum=0; // 색종이들의 넓이
        int N=Integer.parseInt(br.readLine()); // 색종이 갯수
        boolean[][] arr=new boolean[100][100]; // 도화지의 넓이 
        for(int i=0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken()); //x 좌표
            int y=Integer.parseInt(st.nextToken()); // y 좌표
            for(int j=x;j<x+10;j++){
                for(int k=y;k<y+10;k++){
                    if(!arr[j][k])
                    {
                        
                        arr[j][k]=true;
                        sum++;
                    }
                }
            }
            
        }
        System.out.println(sum);
    }
}