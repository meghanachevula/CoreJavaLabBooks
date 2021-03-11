package com.cg.lb3.ui;
import java.util.Scanner;

public class Exercise3 {
	static String replaceConsonants(String str)
    {
           StringBuffer sbr = new StringBuffer(str);
           for(int i=0;i<str.length();i++)
           {
                  char c = sbr.charAt(i);
                  if(!(c==' ' ||c == 'A' || c =='a' || c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u'))
                  {
                        sbr.replace(i,i+1,String.valueOf((char)(c+1)));
                  }
           }
           return sbr.toString();
    }
    public static void main(String[] ar)
    {
           Scanner scan = new Scanner(System.in);
           System.out.println("Enter a string");
           String str = scan.nextLine();
           System.out.println(replaceConsonants(str));
           scan.close();
    }

}