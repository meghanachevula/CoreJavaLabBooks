package com.cg.lb2.ui;
import java.util.*;
public class Exercise1 {
	static int getSecondSmallest(int [] arr) {
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[1];
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of array");
		int n=scan.nextInt();
		int [] arr= new int[n];
		System.out.println("enter the elements"); 
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Second minimum element is: "+getSecondSmallest(arr));
		
		scan.close();
	}

}
