package com.cg.lb1.ui;
import java.util.*;
public class Exercise8 {
	static boolean checkNumber(int num) {
		int result=1;
		boolean flag=false;
		while(result<num) {
			result= result*2;
		}
		if(result==num) {
			flag=true;
		}
		//System.out.println(result);
		return flag;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num= scan.nextInt();
		if(checkNumber(num)) {
			System.out.println("Number is power of 2");
		}
		else {
			System.out.println("Number is not the power of 2");
		}
		scan.close();
	}

}
