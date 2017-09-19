package com.anthem.tat.DateUtility;

import org.joda.time.LocalDate;

public class CompareDate {

	public boolean isReceivedDateonAfterEndDate(LocalDate receivedDate, LocalDate endDate) {

		if (receivedDate.isBefore(endDate) || receivedDate.equals(endDate)) {

			System.out.println("Hi Condition is True");
			return true;

		} else {
			System.out.println("Hi Condition is False");
			return false;
		}

	}
	
	
	
	public static void main (String args [])
	{
		
		CompareDate dt = new CompareDate();
		
		LocalDate receivedDate = new LocalDate("2017-01-01");
		LocalDate endDate = new LocalDate("2016-01-01");
		dt.isReceivedDateonAfterEndDate(receivedDate, endDate);
	}
}
