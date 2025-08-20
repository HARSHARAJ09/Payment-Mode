package in.ps.payment.mode;

public class CreditCard implements IPayment {

	@Override
	public void doPayment() {
		System.out.println("Payment successful using Credit Card");
	}

}
