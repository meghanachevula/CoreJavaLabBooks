package com.cg.lb6.ui;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class GetSorted {
	public static Object[] getSorted(int[] arr) {
		List<Integer> li =new ArrayList<>();
		for(int i:arr) {
			int r=0;
			while(i!=0) {
				int digit =i%10;
				r=r*10+digit;
				i/=10;
			}
			li.add(r);
		}
		Collections.sort(li);
		return li.toArray();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length");
		int n= scan.nextInt();
		int [] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i]=scan.nextInt();
		}
		Object obj[]=getSorted(array);
		for(Object o:obj) {
			System.out.println(o);
		}
	}

}