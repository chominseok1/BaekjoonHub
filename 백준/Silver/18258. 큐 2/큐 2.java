import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int ln=0; // back 연산
        Queue<Integer> q=new LinkedList<>();
        StringBuilder sb=new StringBuilder();
        String s="";
        for(int i=0;i<n;i++){
            s=br.readLine();
            if(s.startsWith("push")){
                StringTokenizer st=new StringTokenizer(s);
                st.nextToken();
                int push=Integer.parseInt(st.nextToken());
                ln=push; // 마지막에 들어오는 숫자로 ln이 계속 바뀜
                q.add(push);
            }
            else{
                if(s.equals("pop")){
                    if(q.isEmpty()){
                        sb.append("-1\n");
                    }
                    else{
                        sb.append(q.poll()+"\n");
                    }
                }
                else if(s.equals("size")){
                     sb.append(q.size()+"\n");
                }
                else if(s.equals("empty")){
                     if(q.isEmpty()){
                        sb.append("1\n");
                    }
                    else{
                        sb.append("0\n");
                    }
                }
                else if(s.equals("front")){
                    if(q.isEmpty()){
                        sb.append("-1\n");
                    }
                    else{
                        sb.append(q.peek()+"\n");
                    }
                }
                else{
                 // back    
                     if(q.isEmpty()){
                        sb.append("-1\n");
                    }
                    else{
                        sb.append(ln+"\n");
                    }
                }
            }
        }
        System.out.println(sb.toString());
    }
}