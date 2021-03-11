package com.cg.lb6.ui;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GetSecondSmallest {
	public static int getSecondSmallest(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i:arr){
			list.add(i);
			}
		
		Collections.sort(list);
		return list.get(1);
		}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length");
		int n= scan.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
	
		System.out.println(getSecondSmallest(arr));
		}
}