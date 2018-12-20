package principles.solid.srp.refactoring;

import principles.solid.srp.Cart;
import principles.solid.srp.PaymentDetails;

public class Website {
	
	private OnlineOrder onlineOrder;

	public Website() {
		super();
		this.onlineOrder = new OnlineOrder(new Cart(), new PaymentDetails());
	}
	
	public void processOrder(){		
		onlineOrder.checkout();
	}

}
