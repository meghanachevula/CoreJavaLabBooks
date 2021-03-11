package com.cg.lb3.ui;
import java.util.Scanner;

public class Exercise2 {
	 static String getImage(String str)
     {
            StringBuffer sbp = new StringBuffer(str);
            sbp.append('|');
            StringBuffer sb = new StringBuffer(str);
            sb.reverse();
            sbp.append(sb);
            return sbp.toString();
     }
     public static void main(String[] ar)
     {
            
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a String");
            String str = scan.nextLine();
            System.out.println(getImage(str));
            scan.close();
     }
}