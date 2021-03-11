package com.cg.lb2.ui;
import java.util.*;
public class Exercise3 {
	
	static int [] getSorted(int [] arr) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			int revNumber=0,rem;
			while(arr[i]>0) {
				rem=arr[i]%10;
				revNumber=revNumber*10+rem;
				arr[i]/=10;
			}
			arr[i]=revNumber;
		}
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
			
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of array");
		int n = scan.nextInt();
		int []arr= new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++) {
			 arr[i]=scan.nextInt();
			 
		}
		int [] result= getSorted(arr);
		for(int i=0;i<n;i++) {
			System.out.println(result[i]);
		}
		scan.close();
	}

}
