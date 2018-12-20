package principles.solid.srp.refactoring;

import principles.solid.srp.Cart;
import principles.solid.srp.PaymentDetails;

public class OnlineOrder extends Order {	

	private InventoryService inventory;
	
	private PaymentProcessor payment;
	
	private NotificationService notification;
	
	private PaymentDetails paymentDetails;
	
	public OnlineOrder(Cart cart,PaymentDetails paymentDetials) {
		super(cart);
		this.inventory = new ReservationService();
		this.payment = new CreditCardPaymentProcessor();
		this.notification = new EmailNotification();
	}
	@Override
	public void checkout() {
		
		payment.process(paymentDetails);
		
		inventory.reserve(this.cart.getItems());
		
		notification.notify(this.cart);

	}

}
