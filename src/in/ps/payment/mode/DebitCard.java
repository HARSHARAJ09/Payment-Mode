package in.ps.payment.mode;

public class DebitCard implements IPayment {

	@Override
	public void doPayment() {
		System.out.println("Payment successful using Debit Card");
	}
	

}
