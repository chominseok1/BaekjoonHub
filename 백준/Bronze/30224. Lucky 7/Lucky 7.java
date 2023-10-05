import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String N=br.readLine();
        if((!N.contains("7"))&&Integer.parseInt(N)%7!=0) {
        	System.out.print(0);
        }
        else if((!N.contains("7"))&&Integer.parseInt(N)%7==0)
        	System.out.print(1);
        else if(N.contains("7")&&Integer.parseInt(N)%7!=0)
        	System.out.print(2);
        else
        	System.out.print(3);
    }
}