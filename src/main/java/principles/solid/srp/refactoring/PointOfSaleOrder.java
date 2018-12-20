package principles.solid.srp.refactoring;

import principles.solid.srp.Cart;
import principles.solid.srp.PaymentDetails;

public class PointOfSaleOrder {

	private POSCashOrder posCashOrder;

	private POSCreditOrder posCreditOrder;

	public PointOfSaleOrder() {
		super();
		this.posCashOrder = new POSCashOrder(new Cart());
		this.posCreditOrder = new POSCreditOrder(new Cart(), new PaymentDetails());
	}

	public void processOrder() {
		posCashOrder.checkout();

		posCreditOrder.checkout();
	}

}
