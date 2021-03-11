package com.cg.lb3.ui;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise8 {
	static boolean isAlphabaticOrder(String s)  
    {  
       
        int n = s.length();  
        
        char ch[] = new char [n];  
        
        for (int i = 0; i < n; i++) {  
            ch[i] = s.charAt(i);  
        }  
       
        Arrays.sort(ch);  
    
        for (int i = 0; i < n; i++)  
            if (ch[i] != s.charAt(i))   
                return false;          
        return true;      
    }  
      
    public static void main(String args[]) 
    { 
        Scanner scan = new Scanner(System.in);
        String str= scan.nextLine();
      
        if (isAlphabaticOrder(str))  
           System.out.println("Yes");  
        else
            System.out.println("No");  
        scan.close();
            
    } 

}