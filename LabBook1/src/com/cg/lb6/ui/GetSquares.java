package com.cg.lb6.ui;
import java.util.*;

public class GetSquares {
 
  public static HashMap<Integer, Integer> method(int[] array) {
    HashMap<Integer, Integer> hm = new HashMap<>();
 
    for (int n: array) {
      hm.put( n, n*n);
    }
    return hm;
  }
 
  public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
		System.out.println("enter the length");
		int n= scan.nextInt();
		int [] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i]=scan.nextInt();
		}
    HashMap<Integer, Integer> hm = method(array);
 
    Iterator<Integer> it = hm.keySet().iterator();
    while(it.hasNext()){
    Integer key = it.next();
      System.out.println(key + " : " + hm.get(key));
    }
  }
}