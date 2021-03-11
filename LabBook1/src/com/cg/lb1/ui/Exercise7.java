package com.cg.lb1.ui;
import java.util.*;
public class Exercise7 {
	static boolean checkNumber(int num) {
		int rem1,rem2;
		boolean flag=true;
		while(num>0) {
			rem1=num%10;
			num=num/10;
			rem2=num%10;
			if(rem1<=rem2) {
				flag= false;
			}
			
			
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the number to be checked ");
		int num=scan.nextInt();
		if(checkNumber(num)) {
			System.out.println("Number is increasing ");
		}
		else {
			System.out.println("Number is not increasing");
		}
		scan.close();
	}

}
