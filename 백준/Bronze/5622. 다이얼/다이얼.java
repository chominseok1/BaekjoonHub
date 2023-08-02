import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        int num=0; 
        for(int i=0;i<str.length();i++)
        {
            
            if(str.charAt(i)=='A'||str.charAt(i)=='B'||str.charAt(i)=='C')
            {
               num+=3;
            }
            else if(str.charAt(i)=='D'||str.charAt(i)=='E'||str.charAt(i)=='F')
            {
               num+=4;
            }
             else if(str.charAt(i)=='G'||str.charAt(i)=='H'||str.charAt(i)=='I')
            {
               num+=5;
            }
             else if(str.charAt(i)=='J'||str.charAt(i)=='K'||str.charAt(i)=='L')
            {
               num+=6;
            }
             else if(str.charAt(i)=='M'||str.charAt(i)=='N'||str.charAt(i)=='O')
            {
               num+=7;
            }
             else if(str.charAt(i)=='P'||str.charAt(i)=='Q'||str.charAt(i)=='R'||str.charAt(i)=='S')
            {
               num+=8;
            }
             else if(str.charAt(i)=='T'||str.charAt(i)=='U'||str.charAt(i)=='V')
            {
               num+=9;
            }
             else if(str.charAt(i)=='W'||str.charAt(i)=='X'||str.charAt(i)=='Y'||str.charAt(i)=='Z')
            {
               num+=10;
            }

            
        }
         System.out.println(num);
    }
}