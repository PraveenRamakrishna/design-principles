package principles.solid.ocp.refactoring;

import principles.solid.ocp.OrderItem;

public class EachItemRule implements PriceRule {

	@Override
	public boolean isMatch(OrderItem orderItem) {
		return orderItem.getSku().startsWith("EACH");
	}

	@Override
	public double calculate(OrderItem orderItem) {
		return orderItem.getQuntity() * orderItem.getPrice();
	}

}
