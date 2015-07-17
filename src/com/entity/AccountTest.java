package com.entity;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import sun.util.logging.resources.logging;

public class AccountTest {
	private static int NUM_OF_THREAD = 10;
	static Thread[] threads = new Thread[NUM_OF_THREAD];

	public static void main(String[] args) {
//		final Account acc = new Account("John", 1000.0f);
//		for (int i = 0; i < NUM_OF_THREAD; i++) {
//			threads[i] = new Thread(new Runnable() {
//				public void run() {
//					acc.deposit(100.0f);
//					acc.withdraw(100.0f);
//				}
//			});
//			threads[i].start();
//		}
//		for (int i = 0; i < NUM_OF_THREAD; i++) {
//			try {
//				threads[i].join(); // 等待所有线程运行结束
//			} catch (InterruptedException e) {
//				// ignore
//			}
//		}
//		System.out.println("Finally, John's balance is:" + acc.getBalance());
//		System.out.println(args.length);
//		for(String aa :args){
//			System.out.println(aa);
//		}
		
//		System.out.println(25/10);
//		System.out.println(20%10);
		
		
		Clock clock = Clock.systemDefaultZone();
		long millis = clock.millis();
		
		Instant instant = clock.instant();
		
		Date legcyDate  =  Date.from(instant);
		
		
		ZoneId zone1 = ZoneId.of("Europe/Berlin");
		
		ZoneId zone2 = ZoneId.of("Asia/Shanghai");
		
		LocalTime now1=LocalTime.now(zone1);
		LocalTime now2=LocalTime.now(zone2);
		
		LocalDate today = LocalDate.now();
		
		LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
		LocalDate yesterday = today.minusDays(1);
		
		LocalDate yesterdayd = today.minusMonths(1);
		
		Month month=today.getMonth();
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		LocalDateTime todaytime=LocalDateTime.now();
		
		String tosy = formatter.format(todaytime);
		
		DayOfWeek dw= today.getDayOfWeek();
		
		System.out.println(clock);
		System.out.println(millis);
		System.out.println(instant);
		System.out.println(legcyDate);
		
		System.out.println(zone1.getRules());
		System.out.println(zone2.getRules());
		
		System.out.println(now1);
		System.out.println(now2);
		
		System.out.println(today);
		System.out.println(tomorrow);
		System.out.println(yesterday);
		System.out.println(dw);
		System.out.println(yesterdayd);
		
		System.out.println(month);
		System.out.println(tosy);
		
	}
}
