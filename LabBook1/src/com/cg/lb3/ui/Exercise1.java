package com.cg.lb3.ui;
import java.util.*;

public class Exercise1 {
	public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n;
        int sum = 0;
        System.out.println("Enter integers seperated by comma(,)");
        String str = scan.nextLine();
        StringTokenizer st = new StringTokenizer(str, ",");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            sum = sum + n;
        }
        System.out.println("sum of the integers in the given string : " + sum);
        scan.close();
    }         

}