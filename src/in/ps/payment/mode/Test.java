package in.ps.payment.mode;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Payment mode:");
		String payment_mode=sc.next();
		IPayment ip=PaymentMode.payment(payment_mode);
		if(ip!=null)
		{
		ip.doPayment();
		}
		}
		}