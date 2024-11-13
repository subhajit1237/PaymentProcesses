package com.accenture.lkm.PaymentProcessingSystem;

/**
 * Hello world!
 *
 */
public class App
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Credit1 credit1 = new Credit1() {
			public void payPalPayment() {
				// TODO Auto-generated method stub
				System.out.println("Credit1's paypal method used");
			}
		};
		Credit2 credit2 = new Credit2() {
			public void creditCardPayment() {
				// TODO Auto-generated method stub
				System.out.println("Credit2's credit card method used");
			}
		};
		credit1.creditCardPayment();
		credit1.payPalPayment();
		credit2.creditCardPayment();
		credit2.payPalPayment();
	}
 
}

