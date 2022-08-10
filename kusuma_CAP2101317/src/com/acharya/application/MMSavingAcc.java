package com.acharya.application;

import com.acharya.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	
	private static final float MINBAL= 2000.0f;
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		
	}

	

	public void withdraw(float accBal) {
		System.out.println("Dear Saving account holder your account balance is Rs." + accBal);

}

	

	public static float getMinbal() {
		return MINBAL;
	}



	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
	}

