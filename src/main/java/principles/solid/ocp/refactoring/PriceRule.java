package principles.solid.ocp.refactoring;

import principles.solid.ocp.OrderItem;

public interface PriceRule {
	
	boolean isMatch(OrderItem orderItem);
	
	double calculate(OrderItem orderItem);

}
