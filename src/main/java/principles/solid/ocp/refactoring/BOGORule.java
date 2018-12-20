package principles.solid.ocp.refactoring;

import principles.solid.ocp.OrderItem;

public class BOGORule implements PriceRule {

	@Override
	public boolean isMatch(OrderItem orderItem) {
		return orderItem.getSku().startsWith("BOGO");
	}

	@Override
	public double calculate(OrderItem orderItem) {
		double total = orderItem.getQuntity() * orderItem.getPrice();
		if(orderItem.getQuntity()>1){
			long bogo = orderItem.getQuntity() / 2;
			total -= bogo*orderItem.getPrice();
		}
		return total;
	}

}
