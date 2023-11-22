// 카드가 두장 남을때까지 while문을 돌려야됨
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine()); // 6
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(i); //q에다가 집어넣고
        }
        // while문 카드가 2장 남을 때까지 돌겠지.
        while(q.size()>1){
            //카드의 맨위에 꺼는 버려
            q.poll();
            q.add(q.poll());
        }
        System.out.println(q.poll()); //마지막 남은 카드 뽑아서 출력
    }
}