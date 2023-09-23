import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		// TODO Auto-generated method stub
		String s=br.readLine();
        StringTokenizer st=new StringTokenizer(s);
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        List<Integer> list=new ArrayList<>();
        
        int index=0;
        for(int i=1;i<=a;i++){
            if(a%i==0) 
            { 
                list.add(i);
                index++;
            }
        }
        
        if(index<b)
            System.out.println("0");
        
        else
            System.out.println(list.get(b-1));
    }
}