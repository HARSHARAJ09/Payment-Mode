package in.ps.payment.mode;

public class PaymentMode {
	public static IPayment payment(String in)
	//factory or helper method
	{
	if(in.equalsIgnoreCase("UPI")){
	return new UPI();
	}
	else if(in.equalsIgnoreCase("Credit")){
	return new CreditCard();
	}
	else if(in.equalsIgnoreCase("Debit")){
	return new DebitCard();
	}
	else{
	System.err.println("No such payment option available");
	return null;
	}
}
}
