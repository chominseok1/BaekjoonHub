import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine()); // 8
        int arr[]=new int[n]; // 수열 뺄 배열
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine()); 
        }
        Stack<Integer> stack=new Stack<>();
        int num=1;
        StringBuffer sb=new StringBuffer(); // push pop 저장할 공간 
        boolean result=true; // StringBuffer 출력 용도 
        for(int i=0;i<arr.length;i++){
            int snum=arr[i];
            if(snum>=num){
                while(snum>=num){
                    stack.push(num++);
                    sb.append("+\n"); // +저장하면서 줄바꿈
                }
                stack.pop();
                sb.append("-\n");
            }
            else // snum<=num 일때
            {
                int sn=stack.pop();
                if(sn>snum){
                    System.out.println("NO");
                    result=false;
                     break;
                }
                else{
                    // sn이 작을 때 
                   
                    sb.append("-\n");
                }
            }
        }
        if(result){
            System.out.println(sb.toString());
        }
    }
}