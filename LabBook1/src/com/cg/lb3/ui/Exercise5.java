package com.cg.lb3.ui;

import java.util.*;
import java.io.*;

public class Exercise5 {
	public static void main(String args[]) throws IOException {
		int nl = 1, nw = 0;
		char ch;
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the path ");
		String str = scan.nextLine();
		FileInputStream file = new FileInputStream(str);
		int n = file.available();
		for (int i = 0; i < n; i++) {
			ch = (char) file.read();
			if (ch == '\n')
				nl++;
			else if (ch == ' ')
				nw++;

		}
		System.out.println("\nNumber of lines : " + nl);
		System.out.println("\nNumber of words : " + (nl + nw));
		System.out.println("\nNumber of characters : " + n);
		file.close();
		scan.close();
		

	}

}