package principles.solid.ocp.refactoring;

import principles.solid.ocp.OrderItem;

public class SixtyDiscountRule implements PriceRule {

	@Override
	public boolean isMatch(OrderItem orderItem) {

		return orderItem.getSku().startsWith("60%");
	}

	@Override
	public double calculate(OrderItem orderItem) {
		return (orderItem.getQuntity() * orderItem.getPrice() - orderItem.getQuntity() * orderItem.getPrice() * (0.6));
	}

}
