package com.Cloninig;

import java.time.LocalDate;
//import java.time.LocalDateTime;

public class CarDriver {
	public static void main(String[] args) {
		Car2 c=new Car2(1,"ABC");
		Car2 c1=c.getClone(c);
		System.out.println(c.hashCode());
		System.out.println(c1.hashCode());
		LocalDate date= LocalDate.of(2071, 1, 1);
		System.out.println(date.isAfter(null));
		System.out.println(date.isLeapYear());
	}

}
