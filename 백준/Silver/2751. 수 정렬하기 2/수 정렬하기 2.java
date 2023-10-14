import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(br.readLine());
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        for(int a:list){
            sb.append(a).append('\n');
        }
        System.out.print(sb);
    }
}