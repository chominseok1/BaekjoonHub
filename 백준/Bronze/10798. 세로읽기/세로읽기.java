import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[][] arr=new String[5][15];
        for(int i=0;i<arr.length;i++){
            String s=br.readLine(); //aasdsadasd
            for(int j=0;j<s.length();j++){ // for(int j=0 ; j < 15 ; j++)  012345....14 , s10(0-9)
                arr[i][j]=String.valueOf(s.charAt(j));
            }
        }
        for(int j=0;j<15;j++){
            for(int i=0;i<5;i++){
               if(arr[i][j]!=null)
                 System.out.print(arr[i][j]);
            }
        }
    }
}