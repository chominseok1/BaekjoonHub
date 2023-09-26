import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int A=Integer.parseInt(st.nextToken());
        int B=Integer.parseInt(st.nextToken());
        int V=Integer.parseInt(st.nextToken());
        int day=(V-A)/(A-B); // V-A를 하는이유: (A-B)는 하루
//달팽이가 마지막 날 얼마큼 오를지 모르기 때문에 마지막 날이 될 수 있는 최소한의 높이로 계산해주는 것이다.
        if((V-A)%(A-B)!=0)
            day++;
        System.out.println(day+1); // 마지막 날 오른걸 빼고 계산한 day여서 +1;
    }
}