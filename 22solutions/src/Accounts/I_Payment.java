package Accounts;

import Payment.*;
import Jobs.*;

public interface I_Payment {

	/**
	 * 
	 * @param amount
	 * @param card4digits
	 */
	abstract Payment makePayment(double amount, String card4digits);

	/**
	 * 
	 * @param paymentLink
	 */
	abstract Job getPayment(int paymentLink);

}