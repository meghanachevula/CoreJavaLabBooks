package com.cg.lb3.ui;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int input = scan.nextInt();
		String str = Integer.toString(input);
		char a[] = str.toCharArray();
		int num = str.length();
		int b[] = new int[num];
		for (int i = 0;i<num;i++) {
			b[i] = Character.getNumericValue(a[i]);
		}
		String ans = "";
		for (int i = 0;i<num-1 ; i++) {
			int d = Math.abs(b[i]-b[i+1]);
			ans+=(char)(d+'0');
		}
		ans+=(char)(b[num-1]+'0');
		System.out.println(ans);
		scan.close();
	}
}