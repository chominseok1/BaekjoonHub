import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i)-'0');
        }
        Collections.sort(list);
        Collections.reverse(list);
        for(int a:list){
            System.out.print(a);
        }
    }
}