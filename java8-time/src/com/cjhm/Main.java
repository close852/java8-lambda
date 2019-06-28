package com.cjhm;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		//java.time
		// LocalDate 날짜 표현
		// LocalDateTime 시간 표현
		LocalDate today = LocalDate.now();
		LocalTime time= LocalTime.now();
		LocalDateTime present = LocalDateTime.now();
		System.out.println(today+" "+present);
		System.out.println(time+" "+present);
		
		LocalDate birthDay = LocalDate.of(2019, 06, 28);
		LocalDateTime birthTime = LocalDateTime.of(2019, 06,28,00,00,00);
		LocalTime birthTimes = LocalTime.of(23, 06,28);
		System.out.println(birthDay +" / "+birthTimes+" / "+birthTime);
		System.out.println(birthDay.get(ChronoField.DAY_OF_YEAR));
	}

}
