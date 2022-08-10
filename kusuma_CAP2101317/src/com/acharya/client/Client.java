package com.acharya.client;

import com.acharya.application.MMBankFactory;
import com.acharya.application.MMCurrentAcc;
import com.acharya.application.MMSavingAcc;
import com.acharya.framework.BankFactory;
import com.acharya.framework.CurrentAcc;
import com.acharya.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
		
		SavingAcc sa = new MMSavingAcc(01, "kusuma", 5000, true);
		CurrentAcc ca = new MMCurrentAcc(02, "anusha", 7000, 1000);
		sa.withdraw(sa.getAccBal());
		sa.toString();
		ca.withdraw(ca.getCreditLimit());
		ca.toString();
	}

}
