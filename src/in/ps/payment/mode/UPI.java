package in.ps.payment.mode;

public class UPI implements IPayment{

	@Override
	public void doPayment() {
		
		System.out.println("Payment successful through UPI");
	}
	
	
}
