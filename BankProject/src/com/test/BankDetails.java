package com.test;

public class BankDetails implements AccountNoClass {

	public void detailInfo() {
		String s1 = "-------------------------------";
		String s2 = "     	 Bank Detials";
		String s3 = "-------------------------------";

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

	@Override
	public void accountNoDetails() {
		int x = 1233456;

		System.out.println("Account no is: " + x);

	}

}
