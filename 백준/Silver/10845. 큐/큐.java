/*
push X: 정수 X를 큐에 넣는 연산이다.
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 큐에 들어있는 정수의 개수를 출력한다.
empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
*/
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine()); 
        int num=0; // back 연산을 할 때 사용 
        String s="";
        StringBuffer sb=new StringBuffer();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            s=br.readLine();
            if(s.startsWith("push")){
                StringTokenizer st=new StringTokenizer(s);
                st.nextToken();
                int a=Integer.parseInt(st.nextToken());
                q.add(a);
                num=a;
            }
            else{
                switch(s){
                    case "pop":
                        if(q.isEmpty())
                            sb.append("-1\n");
                        else
                            sb.append(q.poll()+"\n");
                        break;
                    case "size":
                        sb.append(q.size()+"\n");
                        break;
                    case "empty":
                        if(q.isEmpty())
                            sb.append("1\n");
                        else
                            sb.append("0\n");
                        break;
                    case "front":
                            if(q.isEmpty())
                            sb.append("-1\n");
                        else
                            sb.append(q.peek()+"\n");
                        break;
                    case "back":
                        if(q.isEmpty())
                            sb.append("-1\n");
                        else
                            sb.append(num+"\n");
                        break;
                }
            }
        }
        System.out.println(sb.toString());
    }
}