import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int count=n; // count를 줄여나가는 
        for(int i=0;i<n;i++){
            String s=br.readLine();
            boolean arr[]=new boolean[26];
            arr[s.charAt(0)-'a']=true;
            for(int j=1;j<s.length();j++){
                char c=s.charAt(j);
                
                if(c==s.charAt(j-1))
                    continue;
                else if(arr[c-'a']){
                    count--;
                    break;
                }
                else
                    arr[c-'a']=true;
             }
        }
        System.out.println(count);
    }
}