package principles.solid.srp.refactoring;

import principles.solid.srp.Cart;
import principles.solid.srp.PaymentDetails;

public class POSCreditOrder extends Order{

	private PaymentProcessor paymentProcessor;
	
	private PaymentDetails paymentDetails;
	
	public POSCreditOrder(Cart cart,PaymentDetails paymentDetails) {
		super(cart);
		this.paymentDetails = paymentDetails;
		this.paymentProcessor = new CreditCardPaymentProcessor();
	}

	@Override
	public void checkout() {
		this.paymentProcessor.process(this.paymentDetails);
	}

}
