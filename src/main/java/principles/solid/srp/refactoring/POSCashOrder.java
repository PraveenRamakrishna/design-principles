package principles.solid.srp.refactoring;

import principles.solid.srp.Cart;

public class POSCashOrder extends Order{

	public POSCashOrder(Cart cart) {
		super(cart);
	}
	
	@Override
	public void checkout() {
		//Checkout
	}

}
