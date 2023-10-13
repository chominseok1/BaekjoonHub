import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        String a="1 2 3 4 5 6 7 8";
        String b="8 7 6 5 4 3 2 1";
        if(a.equals(s))
            System.out.println("ascending");
        else if(b.equals(s))
            System.out.println("descending");
        else
            System.out.println("mixed");
    }
}