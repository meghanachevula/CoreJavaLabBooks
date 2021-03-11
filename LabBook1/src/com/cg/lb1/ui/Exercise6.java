package com.cg.lb1.ui;
import java.util.*;
public class Exercise6 {
	static int calculateDifference(int num) {
		int sum1=0,sum2=0;
		for(int i=1;i<=num;i++) {
			sum1+=i*i;
			sum2+=i;
		}
		return (sum1-sum2);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number ");
		int num= scan.nextInt();
		System.out.println("DIFFERENCE is: " + calculateDifference(num));
		
		scan.close();
	}

}
