package com.accenture.lkm.PaymentProcessingSystem;

//public abstract class Credit1 extends Payment {
//
//	@Override
//	public void CreditCardPayment() {
//		// TODO Auto-generated method stub
//		System.out.println("Paying using my credit card");
//	}
//	
//}
public abstract class Credit1 implements MyCard{
	public void creditCardPayment()
	{
		System.out.println("Credit1's credit card method");
	}
//	public abstract void payPalPayment();
}