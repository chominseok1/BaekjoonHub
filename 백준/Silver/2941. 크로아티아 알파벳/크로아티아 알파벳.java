import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        String s=br.readLine();
        String [] ca={"c=","c-","dz=","d-","lj","nj","s=","z="};
        int index=0; 
        for(int i=0;i<ca.length;i++){
            index=s.indexOf(ca[i]);
            if(index>=0){
                s=s.replaceAll(ca[i],"!");
            }
        }
        System.out.println(s.length());
    }
}