package com.cg.lb3.ui;

import java.time.*;


public class Exercise9 {
	static void

			findDifference(LocalDate start_date,

					LocalDate end_date)

	{

		Period diff = Period.between(start_date, end_date);

		System.out.print("Difference " + "between two dates is: ");

		System.out.printf("%d years, %d months" + " and %d days ",

				diff.getYears(),

				diff.getMonths(),

				diff.getDays());

	}

	public static void main(String[] args) {  

        LocalDate start_date = LocalDate.of(2000, 04, 14); 
        LocalDate end_date = LocalDate.of(2020, 12, 14); 
        findDifference(start_date, end_date); 

    }
}