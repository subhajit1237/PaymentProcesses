package com.accenture.lkm.PaymentProcessingSystem;

//public abstract class Credit2 extends Payment{
//
//	@Override
//	public void PayPalPayment() {
//		// TODO Auto-generated method stub
//		System.out.println("Paying using my paypal");
//	}
//	
//}
public abstract class Credit2 implements MyCard{
//	public abstract void creditCardPayment();
	public void payPalPayment()
	{
		System.out.println("Credit2's paypal method");
	}
}