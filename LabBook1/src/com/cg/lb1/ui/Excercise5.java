package com.cg.lb1.ui;
import java.util.*;
public class Excercise5 {
	static int calculateSum(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the number upto which sum has to be calculated");
		int num= scan.nextInt();
		System.out.println("SUM is: " + calculateSum(num));
		
		
		scan.close();
		
		
		
		
		

	}

}
