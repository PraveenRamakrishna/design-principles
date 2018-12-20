package principles.solid.srp.problem;


import principles.solid.srp.Cart;
import principles.solid.srp.InventorySystem;
import principles.solid.srp.Item;
import principles.solid.srp.PaymentDetails;
import principles.solid.srp.PaymentGateway;
import principles.solid.srp.PaymentMethod;

public class Order {
	
	public void checkout(Cart cart, PaymentDetails paymentDetails, boolean notifyCustomer){
		
		if(paymentDetails.getPaymentMethod().equals(PaymentMethod.CREDIT_CARD)){
			chargeCard(paymentDetails, cart);
		}
		
		reserveInventory(cart);
		
		if(notifyCustomer){
			notifyCustomer(cart);
		}
		
	}
	
	public void chargeCard(PaymentDetails paymentDetails, Cart cart){
		PaymentGateway gateway = PaymentGateway.builder().creditCardNumber(paymentDetails.getCreditCardNumber())
														 .expireMonth(paymentDetails.getExpireMonth())
														 .expireYear(paymentDetails.getExpireYear())
														 .nameOnTheCard(paymentDetails.getNameOnTheCard())
														 .amountToCharge(cart.getTotalAmount()).build();
		gateway.charge();
	}
	
	public void notifyCustomer(Cart cart){
		//Code to notify customer
	}
	
	public void reserveInventory(Cart cart){
		InventorySystem inventory = new InventorySystem();
		for (Item item : cart.getItems()) {
			inventory.reserve(item);
		}
	}
}
