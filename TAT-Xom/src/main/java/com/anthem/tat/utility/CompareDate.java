package com.anthem.tat.utility;

import org.joda.time.LocalDate;

public class CompareDate {

	/**
	 * @param receivedDate
	 * @param endDate
	 * @return
	 */
	public static boolean isReceivedDateonAfterEndDate(String receivedDate, String endDate) {

		System.out.println("The Received date" + receivedDate + "endDate=" + endDate);

		LocalDate receivedDate1 = new LocalDate(receivedDate);
		LocalDate endDate1 = new LocalDate(endDate);

		if (receivedDate1.isAfter(endDate1) || receivedDate1.equals(endDate1)) {

			System.out.println("Hi Condition is True");
			return true;

		} else {
			System.out.println("Hi Condition is False");
			return false;
		}

	}

	/**
	 * @param receivedDate
	 * @param endDate
	 * @return
	 */
	public static boolean isReceivedDateLessthanEndDate(String receivedDate, String endDate) {

		System.out.println("The Received date" + receivedDate + "endDate=" + endDate);

		LocalDate receivedDate1 = new LocalDate(receivedDate);
		LocalDate endDate1 = new LocalDate(endDate);

		if (receivedDate1.isBefore(endDate1) || receivedDate1.equals(endDate1)) {

			System.out.println("isReceivedDateLessthanEndDate  Condition is True");
			return true;

		} else {
			System.out.println("isReceivedDateLessthanEndDate Condition is False");
			return false;
		}

	}

	public static void main(String args[]) {

		String receivedDate = "2017-01-01";
		String endDate = "2016-01-01";
		CompareDate.isReceivedDateonAfterEndDate(receivedDate, endDate);
	}
}
