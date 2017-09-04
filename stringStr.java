import java.io.*;
import java.util.*;
public class stringStar {
    public static void main(String args[])
    {
        String str,s1="",s2="";
        int c=0,c1,c2;
        Scanner s=new Scanner(System.in);
        str=s.next();
       StringBuilder sb=new StringBuilder(str);
        
            for (int i=0;i<str.length()-1;i++)
        {  int j=i+1;
            char[] p=str.toCharArray();
            
            if(p[i]==p[j])
            {
             sb.insert(j,"*");
               s1=sb.toString();
                 
            }
         j++;
       
        }
    System.out.println(s1);
 
        }}
    
