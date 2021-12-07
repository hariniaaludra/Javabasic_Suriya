package com.beginner.udemy.timetype;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


class Datedifference {
	static void find(LocalDate a, LocalDate b) {
		Period difference = Period.between(a, b);
		System.out.print("Difference between two dates is example:\n");
		System.out.printf("%d days, %d months and %d years", difference.getDays(), difference.getMonths(),difference.getYears());
		System.out.println();
		
		
		
		LocalDate c = LocalDate.parse("2019-02-28");
		LocalDate d = LocalDate.parse("2020-02-28");
		long differenceBetweendate = ChronoUnit.DAYS.between(c, d);
		System.out.println("Difference between two dates is example 2: " + differenceBetweendate + "Days");
		
		LocalDate today = LocalDate.now().plusDays(60);
		System.out.println("After 60 day was :" + today);

		LocalDate todays = LocalDate.parse("2021-11-23");
		System.out.println("currentdate of the months:" + todays);

		System.out.println("First day: " + todays.withDayOfMonth(1));
		System.out.println("Last day: " + todays.withDayOfMonth(todays.lengthOfMonth()));

	}

	public static void main(String[] args)  {
		LocalDate a = LocalDate.of(2019, 02, 15);
		LocalDate b = LocalDate.of(2021, 03, 22);
		find(a, b);

		LocalDate myDateObj = LocalDate.now();
		System.out.println("Before formatting: " + myDateObj);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("After formatting: " + formattedDate);

		LocalDateTime myDateObj1 = LocalDateTime.now();
		DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
		String formattedDate1 = myDateObj1.format(myFormatObj1);
		System.out.println("Date with time: " + formattedDate1);

		LocalDateTime startOfDay = myDateObj.atStartOfDay();
		System.out.print("Starting day of the time:  ");
		System.out.print(startOfDay);

		LocalDateTime endOfDate = myDateObj1.toLocalDate().atTime(LocalTime.MAX);
		System.out.println();
		System.out.print("ending day of the time:  ");
		System.out.print(endOfDate);
	}
}
