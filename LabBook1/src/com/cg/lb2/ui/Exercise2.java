package com.cg.lb2.ui;
import java.util.*;
public class Exercise2 {
	static String [] sortStrings(String[] arr) {
		String temp="";
		int n= arr.length;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].compareTo(arr[j])>0) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		if(n%2==1) {
			for(int i=0;i<(n/2)+1;i++) {
				arr[i]=arr[i].toUpperCase();
			}
			for(int i=(n/2)+1;i<n;i++) {
				arr[i]=arr[i].toLowerCase();
			}
			
		}
		else {
			for(int i=0;i<(n/2);i++) {
				arr[i]=arr[i].toUpperCase();
			}
			for(int i=(n/2);i<n;i++) {
				arr[i]=arr[i].toLowerCase();
			}
			
		}
		
		return arr;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of array ");
		int n= scan.nextInt();
		String [] arr= new String[n];
		System.out.println("enter the string elements");
		for(int i=0;i<n;i++) {
			arr[i]=scan.next();
		}
		
		
		String [] result= sortStrings(arr);
		System.out.println("Sorted order is ");
		for(int i=0;i<result.length;i++) {
			System.out.println(arr[i]);
		}
		scan.close();

	}

}
