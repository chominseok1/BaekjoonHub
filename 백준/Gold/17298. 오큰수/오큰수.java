import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
        int answer[]=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        for(int i=1;i<n;i++){
           while(!stack.isEmpty() && arr[stack.peek()]<arr[i] ){
                answer[stack.pop()]=arr[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            answer[stack.pop()]=-1;
        }
        StringBuilder sb=new StringBuilder();
       for(int i=0;i<answer.length;i++){
           sb.append(answer[i]+" ");
       }
        System.out.println(sb.toString());
    }
}