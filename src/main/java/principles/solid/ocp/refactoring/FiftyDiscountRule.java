package principles.solid.ocp.refactoring;

import principles.solid.ocp.OrderItem;

public class FiftyDiscountRule implements PriceRule {

	@Override
	public boolean isMatch(OrderItem orderItem) {
		return orderItem.getSku().startsWith("50%");
	}

	@Override
	public double calculate(OrderItem orderItem) {
		return orderItem.getQuntity() * orderItem.getPrice() * (0.5);
	}

}
